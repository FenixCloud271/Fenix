package com.example.fenixgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FenixGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FenixGatewayApplication.class, args);
    }

}
