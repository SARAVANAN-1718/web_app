package com.example.employee.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Employee;
import com.example.employee.global.NameNotFoundException;
import com.example.employee.service.EmployeeService;
@RestController
@RequestMapping(value="/employee")
public class Employeecontroller {
	@Autowired
	EmployeeService empser;
	//findby id
	@GetMapping(value="/add/{e}")
	
	public Employee insertEmployee(@PathVariable int  e) {
	
		return empser.insertEmployee(e); 
	 
	}

	//findall
	@PostMapping(value="/adds")
	
	public List<Employee> insertEmployee1() {
	
		return empser.insertEmployee1(); 
	 
	}
	
	//deletebyid
	
    @DeleteMapping(value="/adde/{e}")
	
	public String insertEmployee2(@PathVariable int  e) {
	
		return empser.insertEmployee2(e); 
	 
	}
    
    //update
    @PutMapping(value="/adc")
	
	public String insertEmployee3(@RequestBody Employee  e) {
	
		return empser.insertEmployee3(e); 
	 
	}
    
    //gender
    @GetMapping(value="/getByGender/{gender}")
    public List<Employee>getByGender(@PathVariable String gender) {
    	return empser.getByGender(gender);
    }
    //age
    
    @GetMapping(value="/getmaxage/{age}")
    public List<Integer>getmaxage(@PathVariable int age) {
    	return empser.getmaxage(age);
    }
    
    //name
    @GetMapping(value="/getname")
    public String getmaxsalary(@RequestBody List<Employee> name) {
    	return empser.getmaxsalary(name);
    }
    
    //increasesalary
    
    @GetMapping(value="/salary/{gender}")
    public List<Employee>getSalIncrement(@PathVariable String gender) {
    	return empser.getSalIncrement(gender);
    }
    
    
    @GetMapping(value="/getnameOne/{name}")
    public List<Employee> getEmployeebyName(@PathVariable String name) throws  NameNotFoundException, javax.naming.NameNotFoundException{
    	return empser.getEmployeebyName(name);
    }
    
    
   
	
	
	

}
