package com.ProjectV2.ProjectSQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjectV2.ProjectSQL.model.Accounts;

@Repository
public interface AccountRepo extends JpaRepository<Accounts, Long>{
	
}
