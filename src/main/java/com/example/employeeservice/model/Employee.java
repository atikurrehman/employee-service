package com.example.employeeservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
	private long id;
	private String name;
	private String email;
	private String contatcNumber;

}
