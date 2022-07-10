package com.eviro.assessment.grad001.LwaziTomson;

import java.math.BigDecimal;

public class CurrentAccount {

	private String customerNum;
	private int id;
	private String AccountNumber;
	private BigDecimal balance;
	private BigDecimal overdraft;
	private final static BigDecimal overfraftLimit = new BigDecimal("100000");
	
	public CurrentAccount() {
		
	}
	public CurrentAccount(int id, String  AccountNumber, BigDecimal balance, BigDecimal overdraft ) {
		this.id = id;
		this.AccountNumber = AccountNumber;
		this.balance = balance;
		this.overdraft = overdraft;
	}
	;
	
	
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(BigDecimal overdraft) {
		this.overdraft = overdraft;
	}



	public static BigDecimal getOverfraftlimit() {
		return overfraftLimit;
	}
	public String getCustomerNum() {
		return customerNum;
	}
	public void setCustomerNum(String customerNum) {
		this.customerNum = customerNum;
	}
}
