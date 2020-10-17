package com.testproject.aggregator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = "com.testproject.grpc")
public class Bootstrap {
    public static void main(String[] args)  {
        SpringApplication.run(Bootstrap.class, args);

    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
