package com.bridgelabzs.OOPConcepts.Commercial;

public class Company
{
	private  String companyName;
	private int numberOfShares;
	private int shareAmount;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public int getShareAmount() {
		return shareAmount;
	}
	public void setShareAmount(int shareAmount) {
		this.shareAmount = shareAmount;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", numberOfShares=" + numberOfShares + ", shareAmount="
				+ shareAmount + "]";
	}
	

}
