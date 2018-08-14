package com.ProjectV2.ProjectSQL.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accounts {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String lastName;
	private String accountNum;
	
	public Accounts() {
		
	}
	
	public Accounts(Long id, String name, String lastName, String accountNum) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.accountNum = accountNum;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getAccountNum() {
		return accountNum;
	}



	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}



	@Override
	public String toString() {
		return "Accounts [id=" + id + ", name=" + name + ", lastName=" + lastName + ", accountNum=" + accountNum + "]";
	}
	
	

}
