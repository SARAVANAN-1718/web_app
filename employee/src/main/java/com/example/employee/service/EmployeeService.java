package com.example.employee.service;



import java.util.Comparator;
import java.util.List;

import javax.naming.NameNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.entity.Employee;


@Service
public class EmployeeService {
    @Autowired 
     EmployeeDao empDao;
    
    //findby id
    public Employee insertEmployee(int e) {
    	return empDao.insertEmployee(e);
    }
    
    //findall
    
    public List<Employee> insertEmployee1() {
    	return empDao.insertEmployee1();
    }
    
    //deleteid
    
    public String insertEmployee2(int e) {
    	return empDao.insertEmployee2(e);
    }
    //update
    
    public String insertEmployee3(Employee e) {
    	return empDao.insertEmployee3(e);
    }
    
    //gender
    public List<Employee>getByGender(String gender) { 
    	List<Employee>allEmp=this.insertEmployee1();
    	return allEmp.stream().filter(x->x.getGender().equalsIgnoreCase(gender)).toList();
    }
    //maxsalary
    public List<Integer>getmaxage(int age) {
    	List<Employee>allEmp=this.insertEmployee1();
    	return allEmp.stream().filter(a->a.getAge()>age).map(a->a.getSalary()).toList();
    }
    
    //maxage
    public String getmaxsalary(List<Employee> name) {
    	//List<Employee>allEmp=this.insertEmployee1();
    	Employee max= name.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
    return max.getName();
    }
    //incresesalary
    public List<Employee>getSalIncrement(String gender) {
    	List<Employee>inv=this.insertEmployee1();
    	return inv.stream().filter(i->i.getGender().equalsIgnoreCase("female")).peek(x->x.setSalary(x.getSalary()*105/100)).toList();
    }
    //exception
    
	public List<Employee>getEmployeebyName(String name)throws NameNotFoundException {
		
	List<Employee>allEmp=this.insertEmployee1();
	List<Employee>val=allEmp.stream().filter(a->a.getName().equals(name)).toList();
	
	if(val.isEmpty()==true) {
		throw new NameNotFoundException("no name is found");
		
	}
	else {
		return val;
	}

}


	
    
}

