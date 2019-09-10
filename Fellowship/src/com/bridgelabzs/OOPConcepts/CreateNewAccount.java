package com.bridgelabzs.OOPConcepts;

import com.bridgelabzs.utility.Utility;

public class CreateNewAccount 
{
	String accountHolderName;
	int totalBalance;
	int numberOfShares;
	int shareAmount;
	int withdrawShare;

	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		System.out.println("Enter account holder name");
		accountHolderName=Utility.stringInput();
		this.accountHolderName = accountHolderName;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		System.out.println("Enter number of shares");
		numberOfShares=Utility.integerInput();
		this.numberOfShares = numberOfShares;
	}
	
	public int getShareAmount() {
		return shareAmount;
	}
	public void setShareAmount(int shareAmount) {
		System.out.println("Enter share amount");
		shareAmount=Utility.integerInput();
		this.shareAmount = shareAmount;
	}
	public int getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance() {
		int totalBalance=numberOfShares*shareAmount;
		this.totalBalance = totalBalance;
	}
	
	public int getWithdrawShare() {
		return withdrawShare;
	}
	public void setWithdrawShare() {
		int withdrawShare=(totalBalance-shareAmount);
		totalBalance =totalBalance-withdrawShare;
		this.withdrawShare = withdrawShare;
	}
	
	public static void main(String[] args) 
	{
		CreateNewAccount account=new CreateNewAccount();
		account.setAccountHolderName(account.accountHolderName);
		account.setNumberOfShares(account.numberOfShares);
		account.setShareAmount(account.shareAmount);
		account.setTotalBalance();
		account.setWithdrawShare();
		
		String name=account.getAccountHolderName();
		System.out.println(name);
		int totalBalance=account.getTotalBalance();
		System.out.println(totalBalance);
		int withdrawShare=account.getWithdrawShare();
		System.out.println(withdrawShare);
		System.out.println(totalBalance);
	}
}
