package com.bridgelabzs.OOPConcepts.Commercial;

public class Person
{
	private String  accountHolderName;
	private int numberOfShares;
	private int balance;
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Person [accountHolderName=" + accountHolderName + ", numberOfShares=" + numberOfShares + ", balance="
				+ balance + "]";
	}
	
}
