package com.eviro.assessment.grad001.LwaziTomson;

import java.math.BigDecimal;

public class SavingsAccount {
	
    private String customerNum;
	private int id;
	private String AccountNumber;
	private BigDecimal balance;
	
	//Empty constructor so that i can create an instance of this class 
	public SavingsAccount() {
		
	}
	//Constructor to set the values of a account at once
	public SavingsAccount(int id, String  AccountNumber, BigDecimal balance ) {
		this.id = id;
		this.AccountNumber = AccountNumber;
		this.balance = balance;
	}
	
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

	public String getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(String customerNum) {
		this.customerNum = customerNum;
	}

}
