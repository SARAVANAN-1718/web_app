package com.example.employee.reprosity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.entity.Employee;

public interface EmployeeRepositary extends JpaRepository<Employee,Integer> {
	
	
	

}
