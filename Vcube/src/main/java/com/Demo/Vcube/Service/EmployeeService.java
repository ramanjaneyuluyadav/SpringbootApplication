package com.Demo.Vcube.Service;

import java.util.List;
import java.util.Optional;

import com.Demo.Vcube.model.Department;
import com.Demo.Vcube.model.Employee;



public interface EmployeeService {

	//employee part
	public Employee createEmployee(Employee employee);
    public List<Employee> getAll();
    public Optional<Employee> findByemployeeId(long employeeId);
    public Employee save(Employee employee);
	public void delete(Employee employee);
	
	//department part
	public Department createDepatment(Department department);
    public List<Department> getAll1();
    public Optional<Department> findBydepatmentId(long departmentId);
    public Department save(Department department);
	public void delete(Department department);
}
