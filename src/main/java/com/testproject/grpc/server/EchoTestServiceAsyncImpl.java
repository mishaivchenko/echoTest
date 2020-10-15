package com.testproject.grpc.server;

import com.testproject.grpc.echo.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@GRpcService
public class EchoTestServiceAsyncImpl extends
        EchoTestServiceAsyncGrpc.EchoTestServiceAsyncImplBase {

    private static final Logger logger = LoggerFactory.getLogger(EchoTestServiceAsyncImpl.class);

    @Override
    public StreamObserver<Address> echoAsync(StreamObserver<Responses> responseObserver) {
        return new StreamObserver<Address>() {
            final List<Response> responses = new ArrayList<>();
            @Override
            public void onNext(Address address) {
                String status;
                String responseTime;
                URL url;
                try {
                    url = new URL(address.getHostname());
                    long start = System.nanoTime();
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod(RequestMethod.GET.name());

                    status = String.valueOf(connection.getResponseCode());
                    responseTime = String.valueOf(System.nanoTime() - start);

                } catch (IOException e) {
                    status = "Error occured:" + e.getMessage();
                    responseTime = "-1";
                }

                responses.add(Response.newBuilder()
                        .setStatus(status)
                        .setResponseTime(responseTime)
                        .build());
            }

            @Override
            public void onError(Throwable throwable) {
            logger.error("Error {}", throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                Responses build = Responses.newBuilder().addAllAddresses(responses).build();
                responseObserver.onNext(build);
            }
        };
    }
}
