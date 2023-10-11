package com.example.bank.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bank.entity.Bank;

public interface BankingRepositary extends JpaRepository<Bank,Integer> {
	@Query(value="select ifsccode from bank where branch like ? ",nativeQuery=true)
	public String getifsc(String branch);
	

}
