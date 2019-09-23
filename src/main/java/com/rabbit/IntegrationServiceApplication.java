package com.rabbit;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableRabbit
@EnableDiscoveryClient
@SpringBootApplication
public class IntegrationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationServiceApplication.class, args);
    }

}
