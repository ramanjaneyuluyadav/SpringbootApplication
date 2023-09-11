package com.Demo.Vcube.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Demo.Vcube.Service.EmployeeServiceimpl;
import com.Demo.Vcube.exception.ResourceNotFoundException;
import com.Demo.Vcube.model.Department;
import com.Demo.Vcube.model.Employee;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceimpl employeeserivce;
	
	//postmapping is meant for retrieve all the data from client like classname
	@PostMapping("/employee")
	
	public Employee createEmployee(@Valid  @RequestBody Employee employee){
		
		System.out.println("Hello guru vacheyuu");
		System.out.println(employee);
		return employeeserivce.save(employee);
	}		
		
	
	//getmapping is meant for retrieve all the data from DB
	@GetMapping("/employee")
		
			public List getAllemployee() {
				
		
			//storing return type of Student Entity
		
			return employeeserivce.getAll();
		
			}
		
		//here retrive limited data using by id
		@GetMapping("/employee/{id}")

		
		public ResponseEntity getStudentById(@PathVariable(value = "id") Long employeeId)

		throws ResourceNotFoundException {

		Employee employee = employeeserivce.findByEmployeeId(employeeId)

		.orElseThrow(() -> new ResourceNotFoundException("employee not found for this id :: " + employeeId));

		return ResponseEntity.ok().body(employee);

		}
		
		//delete data using id
		@DeleteMapping("/employee/{id}")
		
		public Map<String, Boolean> deleteemployee(@PathVariable(value = "id") Long employeeId)
		throws ResourceNotFoundException {
			Employee employee = employeeserivce.findByEmployeeId(employeeId)
				
		.orElseThrow(() -> new ResourceNotFoundException("employee not found for this id :: " + employeeId));
		
		employeeserivce.delete(employee);
		
		Map<String, Boolean> response = new HashMap<>();
		
		response.put("deleted", Boolean.TRUE);
		return response;

		}
		//department part
		
		//postmapping is meant for retrieve all the data from client like classname
				@PostMapping("/dept")
				
				public Department createEmployee(@Valid  @RequestBody Department department){
					
					System.out.println("Hi guru vacheyuu");
					System.out.println(department);
					return employeeserivce.save(department);
				}
			
				//getmapping is meant for retrieve all the data from DB
				@GetMapping("/dept")
			
				public List getAlldepartment() {
					
			
				//storing return type of Student Entity
			
				return employeeserivce.getAll();
			
				}
			
		
}
