package com.abhi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "BANK_ACCOUNTS")
public class Account {
	@Column(name = "BRANCH_NAME")
	private String branchName;

	@Column(name = "MIN_BAL")
	private double minBal;
	
	@EmbeddedId
	private AccountPK accountpk;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public double getMinBal() {
		return minBal;
	}

	public void setMinBal(double minBal) {
		this.minBal = minBal;
	}

	public AccountPK getAccountpk() {
		return accountpk;
	}

	public void setAccountpk(AccountPK accountpk) {
		this.accountpk = accountpk;
	}

	@Override
	public String toString() {
		return "Account [branchName=" + branchName + ", minBal=" + minBal + ", accountpk=" + accountpk + "]";
	}

	

	

}