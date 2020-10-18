package com.testproject.grpc.client;

import com.testproject.domain.ResponseDTO;
import com.testproject.grpc.echo.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Component
public class EchoTestClientAsync {

    private static final Logger logger = LoggerFactory.getLogger(EchoTestClientAsync.class);

    private EchoTestServiceAsyncGrpc.EchoTestServiceAsyncStub echoTestServiceStub;

    @PostConstruct
    private void init() {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        echoTestServiceStub = EchoTestServiceAsyncGrpc.newStub(managedChannel);
    }



    public List<ResponseDTO> echoAsync(List<String> addressesList) throws InterruptedException {

        if(addressesList.size() == 0){
            throw new NoSuchElementException();
        }

        List<Address> addresses = addressesList.stream().map(i -> Address.newBuilder()
                .setHostname(i)
                .build()).collect(Collectors.toList());

        final List<ResponseDTO>[] list = new List[]{new ArrayList<>()};

        final CountDownLatch countDownLatch = new CountDownLatch(1);

        StreamObserver<Address> echoAsync = echoTestServiceStub.echoAsync(new StreamObserver<Responses>() {

            @Override
            public void onNext(Responses responses) {

                list[0] = responses.getAddressesList().stream()
                        .map(i -> new ResponseDTO(
                                i.getStatus(),
                                i.getResponseTime(),
                                i.getHostname()))
                        .collect(Collectors.toList());
                logger.info("Client receive {}", list[0]);
                countDownLatch.countDown();
            }

            @Override
            public void onError(Throwable throwable) {
                logger.error("Error {}", throwable.getMessage());
            countDownLatch.countDown();
            }

            @Override
            public void onCompleted() {
                countDownLatch.countDown();
            }
        });

        addresses.forEach(echoAsync::onNext);

        echoAsync.onCompleted();

        if (!countDownLatch.await(2, TimeUnit.MINUTES)) {
            throw new RuntimeException("Server not responding");
        }

        return list[0];
    }

}
