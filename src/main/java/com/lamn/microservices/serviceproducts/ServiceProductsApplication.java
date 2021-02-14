package com.lamn.microservices.serviceproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * The type Service products application.
 */
@EnableEurekaClient
@SpringBootApplication
public class ServiceProductsApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ServiceProductsApplication.class, args);
    }

}
