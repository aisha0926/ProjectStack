package com.ProjectV2.ProjectSQL.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectV2.ProjectSQL.model.Accounts;
import com.ProjectV2.ProjectSQL.repository.AccountRepo;

@Service
public class AccountService {
	
	@Autowired
	AccountRepo accountRepo;
	public Accounts addAccount(Accounts accounts) {
		return accountRepo.save(accounts);
	}
	public List<Accounts> getAllAccounts() {
		
	List<Accounts> list=	new ArrayList<Accounts>();
	
	Iterable<Accounts> all = accountRepo.findAll();
	
	for(Accounts accounts:all) {list.add(accounts);}
		// TODO Auto-generated method stub
		return list;
	}

}
