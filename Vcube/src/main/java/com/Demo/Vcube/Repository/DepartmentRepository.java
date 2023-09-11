package com.Demo.Vcube.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Demo.Vcube.model.Department;
import com.Demo.Vcube.model.Employee;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
