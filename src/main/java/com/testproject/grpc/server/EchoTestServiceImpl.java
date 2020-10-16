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


@GRpcService
public class EchoTestServiceImpl extends
        EchoTestServiceGrpc.EchoTestServiceImplBase {

    private static final Logger logger = LoggerFactory.getLogger(EchoTestServiceImpl.class);

    @Override
    public void echo(Address request, StreamObserver<Response> responseObserver) {
        logger.info("server received {}", request);
        String status;
        String responseTime;

        URL url;
        try {
            url = new URL(request.getHostname());
            long start = System.nanoTime();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(RequestMethod.GET.name());

            status = String.valueOf(connection.getResponseCode());
            responseTime = String.valueOf(System.nanoTime() - start);

        } catch (IOException e) {
            logger.error("server responded {}", e.getMessage());
            status = e.getMessage();
            responseTime = "-1";
        }


        com.testproject.grpc.echo.Response response = com.testproject.grpc.echo.Response.newBuilder()
                .setStatus(status)
                .setResponseTime(responseTime)
                .setHostname(request.getHostname())
                .build();

        logger.info("server responded {}", response);

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
