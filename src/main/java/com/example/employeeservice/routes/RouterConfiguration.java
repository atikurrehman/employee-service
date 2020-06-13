package com.example.employeeservice.routes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

import com.example.employeeservice.handler.EmployeeHandler;

@Configuration
public class RouterConfiguration {

	@Bean
	public RouterFunction employeeRoute(EmployeeHandler employeeHandler) {
		return route(GET("/employees").and(accept(MediaType.APPLICATION_JSON)), employeeHandler::listEmployees);
	}
}
