package com.ProjectV2.ProjectSQL.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ProjectV2.ProjectSQL.model.Accounts;

@Repository
public interface AccountRepo extends CrudRepository<Accounts, Integer>{
	
}
