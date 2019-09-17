package com.bridgelabzs.OOPConcepts.CliniqueMnagement;

import java.util.Scanner;
public class Doctor
{
	private String doctorName;
	private String doctorSpecialization;
	private int doctorID;
	private String doctorAvailabity;
	Scanner scanner=new Scanner(System.in);
	
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName() {
		System.out.println("Enter doctor name");
		String doctorName=scanner.next();
		this.doctorName = doctorName;
	}
	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}
	public void setDoctorSpecialization() {
		System.out.println("Enter doctor Specialization");
		String doctorSpecialization=scanner.next();
		this.doctorSpecialization = doctorSpecialization;
	}
	public int getDoctorID() {
		return doctorID;
	}
	public void setDoctorID() {
		System.out.println("Enter doctor ID");
		int doctorID=scanner.nextInt();
		this.doctorID = doctorID;
	}
	public String getDoctorAvailabity() {
		return doctorAvailabity;
	}
	public void setDoctorAvailabity() {
		System.out.println("Enter doctor availablelity ");
		String doctorAvailabity=scanner.next();
		this.doctorAvailabity = doctorAvailabity;
	}
	
	public void setDetails()
	{
		setDoctorName();
		setDoctorID();
		setDoctorSpecialization();
		setDoctorAvailabity();
	}
	

	
	
	

}
