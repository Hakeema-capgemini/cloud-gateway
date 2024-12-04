package com.example.Cloud_Gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class GatewayConfig {
	
	 @Bean
	    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
	        return builder.routes()
	                .route("app1_route", r -> r.path("/app1/**").uri("http://localhost:8080"))
	                .route("app2_route", r -> r.path("/app2/**").uri("http://localhost:8081"))
	                .build();
	    }

}
