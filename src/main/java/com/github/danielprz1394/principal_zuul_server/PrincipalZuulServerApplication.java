package com.github.danielprz1394.principal_zuul_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class PrincipalZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrincipalZuulServerApplication.class, args);
    }
}
