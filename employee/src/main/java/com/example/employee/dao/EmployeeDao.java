package com.example.employee.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.employee.entity.Employee;
import com.example.employee.reprosity.EmployeeRepositary;
@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepositary empRepo;
	

		
     //findbyid
	public Employee insertEmployee(int e) {
		//empRepo.saveAll(e);
		return empRepo.findById(e).get();
	}
	
	//findall
	public List<Employee> insertEmployee1() {
		return empRepo.findAll();
	}
	
	//deleteid
	
	public String insertEmployee2(int e) {
		//empRepo.saveAll(e);
		 empRepo.deleteById(e);
		 return "success";
	}
	//update
	public String insertEmployee3(Employee e) {
		empRepo.save(e);
		return "updated success";
	}
	//gender
	
	
}
