package com.ProjectV2.ProjectSQL.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accounts {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String lastName;
	private int accountNum;
	
	public Accounts() {
		
	}
	
	public Accounts(String name, String lastName, int accountNum) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.accountNum = accountNum;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
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



	public int getAccountNum() {
		return accountNum;
	}



	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}



	@Override
	public String toString() {
		return "Accounts [id=" + id + ", name=" + name + ", lastName=" + lastName + ", accountNum=" + accountNum + "]";
	}
	
	

}
