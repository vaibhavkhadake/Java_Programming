package com.bridgelabzs.OOPConcepts.AddressBookNew;
import java.util.Scanner;

public class PersonNew 
{
	Scanner scanner=new Scanner(System.in);
	private String personFirstName;
	private String personLastName;
	private AddressNew address;
	private long mobileNumber;
	
	
	public AddressNew getAddress() {
		return address;
	}
	public AddressNew setAddress(AddressNew address) {
		address.setCity();
		address.setState();
		address.setPincode();
		return this.address = address;
	}
	public String getPersonFirstName() {
		return personFirstName;
	}
	public void setPersonFirstName() 
	{
		System.out.println("Enter Person first Name");
		String personFirstName=scanner.next();
		this.personFirstName = personFirstName;
	}
	public String getPersonLastName() {
		return personLastName;
	}
	public void setPersonLastName() {
		System.out.println("Enter Person Last Name");
		String personLastName=scanner.next();
		this.personLastName = personLastName;
	}
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber() 
	{
		System.out.println("Enter Persons Mobile Number ");
		long mobileNumber=scanner.nextLong();
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString() {
		return "PersonNew [personFirstName=" + personFirstName + ", personLastName=" + personLastName + ", address="
				+ address + ", mobileNumber=" + mobileNumber + "]";
	}
}
