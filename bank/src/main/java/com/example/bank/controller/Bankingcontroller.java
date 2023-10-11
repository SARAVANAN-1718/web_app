package com.example.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.entity.Bank;
import com.example.bank.service.BankingService;
@RestController
@RequestMapping(value="/bank")
public class Bankingcontroller {
	
		@Autowired
		BankingService bankser;
		
		@GetMapping(value="/add")
		
		public List<Bank> insert(@RequestBody List<Bank> a) {
		
			return bankser.insert(a); 
		 
		}
		
		@GetMapping(value="/getifsc/{branch}")
		public String getifsc(@PathVariable String branch) {
			return bankser.getifsc(branch);
		}
		
		
		

	

}

