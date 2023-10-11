package com.example.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.dao.Bankingdao;
import com.example.bank.entity.Bank;
@Service
public class BankingService {
	@Autowired
	Bankingdao bankdao;
	
	public List<Bank> insert(List<Bank>a) { 
		
		return bankdao.insert(a);
	}
	
	public String getifsc(String branch) {
		return bankdao.getifsc(branch);
	}
}
