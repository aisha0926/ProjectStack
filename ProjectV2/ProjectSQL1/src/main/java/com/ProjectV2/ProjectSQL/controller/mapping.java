package com.ProjectV2.ProjectSQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectV2.ProjectSQL.model.Accounts;
import com.ProjectV2.ProjectSQL.service.AccountService;

@RestController
@RequestMapping("/test")
public class mapping {
	
	@Autowired
	AccountService accountService;
	@RequestMapping(value="account", method = RequestMethod.GET)
	public List<Accounts> list(){
		return accountService.getAllAccounts();
		
	}
	
	@RequestMapping(value="account", method=RequestMethod.POST)
	public Accounts create(@ModelAttribute Accounts accounts){
		System.out.println(accounts);
		return accountService.addAccount(accounts);
	}
	
	@RequestMapping(value="account/{id}", method=RequestMethod.GET)
	public Accounts get(@PathVariable int id){
		return null;
		
	}
	
	@RequestMapping(value="account/{id}", method=RequestMethod.PUT)
	public Accounts update(@PathVariable int id, @RequestBody Accounts shipwreck){
		return null;
		
	}
	
	@RequestMapping(value="account/{id}", method=RequestMethod.DELETE)
	public Accounts delete(@PathVariable int id){
		return null;
		
	}
	

}
