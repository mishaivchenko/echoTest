package com.testproject.grpc.client;

import com.testproject.domain.ResponseDTO;
import com.testproject.grpc.echo.Address;
import com.testproject.grpc.echo.EchoTestServiceGrpc;
import com.testproject.grpc.echo.Response;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

@Component
public class ConcurrentEchoTestClient {

    private EchoTestServiceGrpc.EchoTestServiceBlockingStub echoTestServiceBlockingStub;

    private static final Logger logger = LoggerFactory.getLogger(ConcurrentEchoTestClient.class);

    @PostConstruct
    private void init() {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 6565)
                .usePlaintext()
                .build();
        echoTestServiceBlockingStub = EchoTestServiceGrpc.newBlockingStub(managedChannel);
    }

    public List<ResponseDTO> echoWithThreads(List<String> addressesList) throws Exception {

        if(addressesList.size() == 0){
            throw new NoSuchElementException();
        }

        List<Address> addresses = addressesList.stream().map(i -> Address.newBuilder()
                .setHostname(i)
                .build()).collect(Collectors.toList());

        List<Response> responses = new ArrayList<>();
        for (Address address : addresses) {
            Callable<Response> c = () -> echoTestServiceBlockingStub.echo(address);
            logger.info("Client sent {}", address.getHostname());
            Response response = c.call();
            logger.info("Client receive {}", response);
            responses.add(response);
        }

        return responses.stream()
                .map(i -> new ResponseDTO(
                        i.getStatus(),
                        i.getResponseTime(),
                        i.getHostname()))
                .collect(Collectors.toList());
    }

}
