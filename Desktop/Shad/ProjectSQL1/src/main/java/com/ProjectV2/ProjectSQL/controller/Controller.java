package com.ProjectV2.ProjectSQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectV2.ProjectSQL.model.Accounts;
import com.ProjectV2.ProjectSQL.service.AccountService;

@RestController
public class Controller {
	
	@Autowired
	private AccountService accountService;
	
		@RequestMapping("/")
		public String home() {
			return "DOASJODASODKAOSKD!";
		}
		
		@GetMapping("/accounts")
		public List<Accounts> accounts(){
			return accountService.getAllAccounts();
		}
		
		@PostMapping(value="/accounts")
		public void addAccounts(@RequestBody Accounts accounts) {
			accountService.insert(accounts);
		}
		
		@DeleteMapping("/account/{id}")
		public void deleteAccount(@PathVariable Long id) {
			accountService.deleteAccount(id);
		}
		
		
		
}
