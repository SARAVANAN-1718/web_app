package com.example.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bank.entity.Bank;
import com.example.bank.repositery.BankingRepositary;

@Repository
public class Bankingdao {
	@Autowired
	BankingRepositary bankRepo;

	public List<Bank> insert(List<Bank>a) {
		
		return bankRepo.saveAll(a);
	}
	public String getifsc(String branch) {
		return bankRepo.getifsc(branch);
	}

	

}
