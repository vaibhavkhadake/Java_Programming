package com.bridgelabzs.OOPConcepts.CliniqueMnagement;

import java.util.Scanner;

public class Patients 
{
	private String patientName;
	private int patientID;
	private long mobileNumber;
	private int age;
	Scanner scanner=new Scanner(System.in);
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName() {
		System.out.println("Enter patient name");
		String patientName=scanner.next();
		this.patientName = patientName;
	}
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID() {
		System.out.println("Enter patient ID");
		int patientID=scanner.nextInt();
		this.patientID = patientID;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber() {
		System.out.println("Enter patient Mobile Number");
		long mobileNumber=scanner.nextLong();
		this.mobileNumber = mobileNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		System.out.println("Enter patient Age");
		int age=scanner.nextInt();
		this.age = age;
	}
	
	public void setPersonDetails()
	{
		setPatientName();
		setPatientID();
		setAge();
		setMobileNumber();
	}
	

}
