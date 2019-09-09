/******************************************************************************
 *  
 *  Purpose: Regular Expression replace specific data using given pattern.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   09/09/2019
 *
 ******************************************************************************/
package com.bridgelabzs.OOPConcepts;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;
import com.bridgelabzs.utility.Utility;
	
public class RegularExpression
{
	private String firstName;
	private String lastName;
	private String fullName;
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


		@SuppressWarnings("static-access")
		public static void main(String[] args) 
		{

		String string = "Hello <<name>>, We have your full name as <<full name>> in our system. \n"
					+ " * your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz \n"
					+ " * 01/01/2016";

		System.out.println("Enter your first name");
		String firstName = Utility.stringInput();
		System.out.println("Enter your last name");
		String lastName = Utility.stringInput();

		String fullname = firstName + " " + lastName;
		//pattern for  alphabets
		Pattern r = Pattern.compile("[a-zA-Z]+");

		if (r.matches("[a-zA-z]+", firstName))
		{
			string = string.replaceAll("<<name>>", firstName);
			string = string.replaceAll("<<full name>>", fullname);
		}
		System.out.println("Enter the mobile number");
		String mobileNo = Utility.stringInput();
		//Pattern for mobile number
		if (Pattern.matches("[789][0-9]{9}", mobileNo))
		{
			string = string.replaceAll("x{10}", mobileNo);
		}
		//find the current date
		LocalDate localDate = LocalDate.now();
		//System.out.println(localDate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedString = localDate.format(formatter);
		string = string.replaceAll("01/01/2016", formattedString);
		System.out.println(string);
		}
	}



