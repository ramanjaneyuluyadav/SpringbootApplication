package com.Demo.Vcube.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {	
	 @Id
     @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
	private Long emp_id;
	private String  emp_name;
	private Long emp_number;
	private String email;
    private long dept_no;
    
    // Mapping the column of this table
    @OneToMany
    //Adding the dept_no
    @JoinColumn(name = "dept_no",nullable = false)
    
	public long getDept_no() {
		return dept_no;
	}

	public void setDept_no(long dept_no) {
		this.dept_no = dept_no;
	}

	//Default contractor
	public Employee() {
			
	}
	//parameter contractor
	
	public Employee(Long emp_id, String emp_name, Long emp_number, String email) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_number = emp_number;
		this.email = email;
	}
	

	public Long getEmp_id() {
		return emp_id;
	}
	
	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	@Column(name = "emp_name", nullable = false)
	
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public Long getEmp_number() {
		return emp_number;
	}
	
	@Column(name = "emp_number", nullable = false) 
	
	public void setEmp_number(Long emp_number) {
		this.emp_number = emp_number;
	}
	public String getEmail() {
		return email;
	}
	
	@Column(name = "email", nullable = false)
	public void setEmail(String email) {
		this.email = email;
	}
    
	
	// toString method
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_number=" + emp_number + ", email="
				+ email + "]";
	}

 
}
