package com.Demo.Vcube.Service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demo.Vcube.Repository.DepartmentRepository;
import com.Demo.Vcube.Repository.EmployeeRepository;
import com.Demo.Vcube.model.Department;
import com.Demo.Vcube.model.Employee;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	private DepartmentRepository departmentRepository;
	

	@Override
	//Employee
	public Employee createEmployee(Employee employee){  
		
		return employeeRepository.save(employee);
	}
	public List<Employee> getAll() {

		return employeeRepository.findAll();

		}
	public Optional<Employee> findByEmployeeId(long employeeId){

		return employeeRepository.findById(employeeId);

		}
	public Employee save(Employee employee) {

		return employeeRepository.save(employee);

		}
	public void delete(Employee employee){

		employeeRepository.delete(employee);

		}
		
		public Optional<Employee> findByemployeeId(long employeeId) {
			// TODO Auto-generated method stub
			return employeeRepository.findById(employeeId);
		}
		
		//department 
		
		@Override
		public Department createDepatment(Department department) {
			// TODO Auto-generated method stub
			return departmentRepository.save(department);
		}
	
		public List<Department> getAll1() {
			// TODO Auto-generated method stub
			return departmentRepository.findAll();
		}
		
		public Optional<Department> findBydepatmentId(long departmentId) {
			// TODO Auto-generated method stub
			return departmentRepository.findById(departmentId);
		}
	
		public Department save(Department department) {
			// TODO Auto-generated method stub
			return departmentRepository.save(department);
		}
		public void delete(Department department) {
			departmentRepository.delete(department);
			
		}

	
}
