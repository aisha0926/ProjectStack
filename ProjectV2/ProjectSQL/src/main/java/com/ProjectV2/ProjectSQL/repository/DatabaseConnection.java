package com.ProjectV2.ProjectSQL.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DatabaseConnection {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

}
