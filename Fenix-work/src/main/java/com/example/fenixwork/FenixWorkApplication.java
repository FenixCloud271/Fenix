package com.example.fenixwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class FenixWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(FenixWorkApplication.class, args);
    }

}
