package com.bridgelabzs.OOPConcepts.AddressBookNew;

import java.util.Scanner;

public class AddressNew
{
	Scanner scanner=new Scanner(System.in);
	private String city;
	private String state;
	private long pincode;
	
	public String getCity() {
		return city;
	}
	public void setCity()
	{
		System.out.println("Enter city name");
		String city=scanner.next();
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState()
	{
		System.out.println("Enter State name");
		String state=scanner.next();
		this.state = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode() {
		System.out.println("Enter Pincode number");
		long pincode=scanner.nextLong();
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "AddressNew [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
