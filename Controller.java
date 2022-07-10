package com.eviro.assessment.grad001.LwaziTomson;

import java.math.BigDecimal;
import java.util.Scanner;


//Business Layer.. with main method that drives the application
//would have used Junit instead of main method if i had internet connection
public class Controller implements AccountService {
	BigDecimal minimum = new BigDecimal("1000");

	public void withdraw(String accountNum, BigDecimal amountToWithdraw) {
		
		

		// Getting savings accounts.. in a real world for loop would be used here
		// but since i know the accounts that are available i'll get them 1 by 1
		String acc1 = SystemDB.savings().get("CustomerLwazi").getAccountNumber();
		String acc2 = SystemDB.savings().get("CustomerMaluka").getAccountNumber();

		// first savings account withdrawal logic:
		if (accountNum.equalsIgnoreCase(acc1)) {
			BigDecimal balance = SystemDB.savings().get("CustomerLwazi").getBalance();
			BigDecimal withdraw = amountToWithdraw.subtract(balance);

			if ((amountToWithdraw.negate().compareTo(minimum.negate()) == 1)) {// ONLY WTHDRAW IF THE BALANCE RULE IS
																				// MET
				System.out.println("WITHDRAWAL SUCCESSFULLY: \n" + "Account Number : " + accountNum + "\n"
						+ "Available Balance: R" + withdraw.negate());
			} else {
				System.out.println("Savings accounts must have a minimum balance of R1000");

			}
		}
		// second savings account withdrawal logic:
		if (accountNum.equalsIgnoreCase(acc2)) {
			BigDecimal balance = SystemDB.savings().get("CustomerMaluka").getBalance();
			BigDecimal withdraw = amountToWithdraw.subtract(balance);
			if ((amountToWithdraw.negate().compareTo(minimum.negate()) == 1)) {// ONLY WTHDRAW IF THE BALANCE RULE IS
																				// MET ..
				
				System.out.println("WITHDRAWAL SUCCESSFULLY: \n" + "Account Number : " + accountNum + "\n"
						+ "Available Balance: R" + withdraw.negate());
			} else {
				System.out.println("Savings accounts must have a minimum balance of R1000");
			}
		}
		
		
		
	
		//Get current accounts
		String current1 = SystemDB.current().get("Customer1").getAccountNumber();
		String current2 = SystemDB.current().get("Customer2").getAccountNumber();
		
		//Current accounts logic:
		if(accountNum.equals(current1)) {
			BigDecimal balance = SystemDB.current().get("Customer1").getBalance();
			BigDecimal overdraftLimit = SystemDB.current().get("Customer1").getOverdraft();
			BigDecimal withdraw = amountToWithdraw.subtract(balance);
			BigDecimal balAndOverdraft = balance.add(overdraftLimit);
			if(amountToWithdraw.negate().compareTo(balAndOverdraft.negate()) == 1 ) {
				System.out.println("WITHDRAWAL SUCCESSFULLY: \n" + "Account Number : " + accountNum + "\n"
						+ "Available Balance: R" + withdraw.negate() +"\n"
						+"Available overdraft: R" +overdraftLimit);
			}else {
				System.out.println("You cannot withdraw more than balance + overdraft Limit");
			}
			
		}
		//Account Service logic
	
		
      if(accountNum.equals(current2)) {
    	   BigDecimal balance = SystemDB.current().get("Customer2").getBalance();
			BigDecimal overdraftLimit = SystemDB.current().get("Customer2").getOverdraft();
			BigDecimal withdraw = amountToWithdraw.subtract(balance);
			BigDecimal balAndOverdraft = balance.add(overdraftLimit);
			if(amountToWithdraw.negate().compareTo(balAndOverdraft.negate()) == 1 ) {
				System.out.println("WITHDRAWAL SUCCESSFULLY: \n" + "Account Number : " + accountNum + "\n"
						+ "Available Balance: R" + withdraw.negate() +"\n"
						+"Available overdraft: R" +overdraftLimit);
			}else {
				System.out.println("You cannot withdraw more than balance + overdraft Limit");
			}
			
		}
	}
	

	
	//main method that provides withdrawal functionality to clients
	public static void main(String[] args) {
		
		Controller controller = new Controller();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for savings account \n " + "Or 2 for Current Account:");

		int option = sc.nextInt();
		if (option != 1 && option != 2) {
			System.out.println("Invalid option");
			sc.close();

		} else if (option == 1) {
			Scanner scc = new Scanner(System.in);
			System.out.println("Enter your savings account number:");
			String account = scc.nextLine();
			
			if (account.equalsIgnoreCase("1") || account.equalsIgnoreCase("2")) 
			{
				Scanner sccc = new Scanner(System.in);
			    System.out.println("Enter amount:");
			   BigDecimal amount = sccc.nextBigDecimal();
				controller.withdraw(account, amount);
				sccc.close();
			} else {
				System.out.println("Savings Account number doesnt exist");
				sc.close();
			}
		}else if(option == 2) {
			Scanner scc = new Scanner(System.in);
			System.out.println("Enter your current account number:");
			String account = scc.nextLine();
			if (account.equalsIgnoreCase("3")){
				Scanner sccc = new Scanner(System.in);
			    System.out.println("Enter amount:");
			    BigDecimal amount = sccc.nextBigDecimal();
			    controller.withdraw(account, amount);
				sccc.close();
			}
			if (account.equalsIgnoreCase("4")){
				Scanner sccc = new Scanner(System.in);
			    System.out.println("Enter amount:");
			    BigDecimal amount = sccc.nextBigDecimal();
			    controller.withdraw(account, amount);
				sccc.close();
			}
		}
	}
}
