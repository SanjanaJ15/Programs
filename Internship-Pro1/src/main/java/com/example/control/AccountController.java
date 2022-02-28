package com.example.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Account;
import com.example.service.AccountService;

@RestController
public class AccountController 
{
	@Autowired
	AccountService s;
	
	//ADD AN ACCOUNT
	@PostMapping("/account")
	public Account addAccount(@RequestBody Account acc)
	{
		return s.addAccount(acc);
	}
	
	//UPDATE AN ACCOUNT
	@PutMapping("/account/{accountid}")
	public Account updateAccount(@RequestBody Account acc, @PathVariable String accountid)
	{		
		return s.updateAccount(acc);
	}

	//DELETE AN ACCOUNT
	@DeleteMapping("/account/{accountid}")
	public String deleteAccount(@PathVariable String accountid)
	{
		if(s.deleteAccount(accountid)==1)
			return "Delete Succesfull";
		else 
			return "Account Not Found";
	}		
	
	//GET ACCOUNT BY NAME
	@GetMapping("/account/{name}")
	public List<Account> findbyAccountByName(@PathVariable String name)
	{
		return s.getbyAccountByName(name);
	}
		
	//GET ALL ACCOUNTS
	@GetMapping("/account")
	public List<Account> findAll()
	{
		return s.getAll();
	}
}
