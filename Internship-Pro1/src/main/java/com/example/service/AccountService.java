package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AccountDao;
import com.example.model.Account;

@Service
public class AccountService {
	
	@Autowired
	AccountDao d;
	
	    //ADD AN ACCOUNT
		public Account addAccount(Account a)
		{
			d.save(a);
			return a;
		}
		
		//UPDATE AN ACCOUNT
		public Account updateAccount(Account a)
		{
			d.save(a);
			return a;
		}

		//DELETE AN ACCOUNT
		public int deleteAccount(String accountId)
		{
			
			if(d.existsById(accountId))
		    {
		    	d.deleteById(accountId);
		    	return 1;
		    }
		    else return 0;
		}
		//GET ACCOUNT BY NAME
		public List<Account> getbyAccountByName(String name)
		{
			return d.findByName(name);
		}
		//GET ALL ACCOUNTS FROM DB
		public List<Account> getAll()
		{
			return d.findAll();
		}
}
