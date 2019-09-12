package com.bridgelabzs.OOPConcepts.AddressBook;

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class AddressBook 
{
	private String firstName,lastName;
	private String address,city,state;
	private long mobileNumber;
	private int pinCode;
	Scanner scanner=new Scanner(System.in);
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName() {
		System.out.println("Enter first name of person");
		String firstName=scanner.nextLine();
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName() {
		System.out.println("Enter Last name of person");
		String lastName=scanner.nextLine();
		this.lastName = lastName;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity() {
		System.out.println("Enter city name of person");
		String city=scanner.nextLine();
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState() {
		System.out.println("Enter state name of person");
		String state=scanner.nextLine();
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode() {
		System.out.println("Enter pincode of person");
		int pinCode=Utility.integerInput();
		this.pinCode = pinCode;
	}
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber() {
		System.out.println("Enter Mobile Number of person");
		long mobileNumber=Utility.longInput();
		this.mobileNumber = mobileNumber;
	}
	
	
	
	@Override
	public String toString()
	{
		return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", mobileNumber=" + mobileNumber + ", pinCode=" + pinCode + "]";
	}
	
	
}
