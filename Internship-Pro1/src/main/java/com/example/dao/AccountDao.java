package com.example.dao;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.model.Account;


@Repository
public interface AccountDao extends MongoRepository<Account,String> 
{
	public List<Account> findByName(String name);
}
