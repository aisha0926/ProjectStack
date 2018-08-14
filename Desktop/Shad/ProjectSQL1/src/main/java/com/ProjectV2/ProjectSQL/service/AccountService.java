package com.ProjectV2.ProjectSQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectV2.ProjectSQL.model.Accounts;
import com.ProjectV2.ProjectSQL.repository.AccountRepo;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepo accountRepo;
	
	public List<Accounts> getAllAccounts() {
		return accountRepo.findAll();
	}


	public void insert(Accounts accounts) {
		accountRepo.save(accounts);
	}
	
	public void deleteAccount(Long id) {
		accountRepo.deleteById(id);
	}

}
