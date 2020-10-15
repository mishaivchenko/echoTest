package com.testproject.grpc.client;

import com.testproject.domain.ResponseDTO;
import com.testproject.grpc.echo.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EchoTestClient {

    private static final Logger logger = LoggerFactory.getLogger(EchoTestClient.class);

    private EchoTestServiceGrpc.EchoTestServiceBlockingStub echoTestServiceBlockingStub;

    @PostConstruct
    private void init(){
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        echoTestServiceBlockingStub = EchoTestServiceGrpc.newBlockingStub(managedChannel);
    }

    public ResponseDTO echo(String host) {

        Address address = Address.newBuilder()
                .setHostname(host)
                .build();
        Response response = echoTestServiceBlockingStub.echo(address);

        return new ResponseDTO(response.getStatus(),response.getResponseTime());
    }








}
