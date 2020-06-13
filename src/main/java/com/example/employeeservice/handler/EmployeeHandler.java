package com.example.employeeservice.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.employeeservice.model.Employee;

import reactor.core.publisher.Mono;

@Component
public class EmployeeHandler {

	public Mono<ServerResponse> listEmployees(ServerRequest request) {
		return ServerResponse.ok()
				.contentType(MediaType.APPLICATION_STREAM_JSON)
				.body(Mono.just(Employee.builder()
				.id(0).name("Atik")
				.email("atikurrehmank@gmail.com")
				.contatcNumber("1234567890")
				.build()),
				Employee.class);

	}

}
