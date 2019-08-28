package com.erbao.helloeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HelloEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloEurekaClientApplication.class, args);
    }

}
