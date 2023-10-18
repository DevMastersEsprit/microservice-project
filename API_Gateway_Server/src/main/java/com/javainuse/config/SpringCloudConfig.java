package com.javainuse.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
        		
//Micro-service 1
                .route(r -> r.path("/evenement/**")
                        .uri("http://localhost:8080/")
                        .id("EvenementMS")).build();

//Micro-service 2
//                .route(r -> r.path("/consumer/**")
//                        .uri("http://localhost:8082/")
//                       .id("consumerModule"))
               
    }

}