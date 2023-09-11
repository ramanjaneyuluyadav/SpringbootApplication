package com.Demo.Vcube.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="dept")
public class Department {
	  
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
	
    private long dept_no;
	private String dept_name;
	private String dept_location;
	
	
	//Default contractor
	public Department() {
		
	
	}
	//parameter contractor
	public Department(long dept_no, String dept_name, String dept_location) {
		super();
		this.dept_no = dept_no;
		this.dept_name = dept_name;
		this.dept_location = dept_location;
	}
	//getter and setters 
	public long getDept_no() {
		return dept_no;
	}
	@Column(name = "dept_no", nullable = false)
	public void setDept_no(long dept_no) {
		this.dept_no = dept_no;
	}
	public String getDept_name() {
		return dept_name;
	}
	@Column(name = "dept_name", nullable = false)
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getDept_location() {
		return dept_location;
	}
	@Column(name = "dept_location", nullable = false)
	public void setDept_location(String dept_location) {
		this.dept_location = dept_location;
	}
	@Override
	public String toString() {
		return "Department [dept_no=" + dept_no + ", dept_name=" + dept_name + ", dept_location=" + dept_location + "]";
	}
	
}
