package com.abhi.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abhi.entity.Account;
import com.abhi.entity.AccountPK;
import com.abhi.repo.AccountRepo;

@Service
public class AccountService {
	private AccountRepo accountrepo;

	public AccountService(AccountRepo accountrepo) {
		this.accountrepo = accountrepo;
	}

	public void getDataUsingPK() {
		AccountPK pk = new AccountPK();
		pk.setAccId(104);
		pk.setAccType("SAVINGS");
		pk.setHolderName("Raj");
		
		Optional<Account> findbyId = accountrepo.findById(pk);
		if(findbyId.isPresent()) {
			System.out.println(findbyId.get());
		}
	}
	
	public void saveAccData() {
		AccountPK pk = new AccountPK();
		pk.setAccId(104);
		pk.setAccType("SAVINGS");
		pk.setHolderName("Raj");
		
		Account acc = new Account();
		acc.setBranchName("PUNPUN");
		acc.setMinBal(5000.0);
		
		acc.setAccountpk(pk); //settng pk class obj to entity obj
		accountrepo.save(acc);
	}

}
