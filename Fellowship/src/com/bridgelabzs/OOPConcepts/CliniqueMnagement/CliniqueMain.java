package com.bridgelabzs.OOPConcepts.CliniqueMnagement;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabzs.utility.Utility;

public class CliniqueMain {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		Operations operations=new Operations();
		int choice=0;
		do
		{
			System.out.println("1.Add New Doctor \n2.Add new patient\n3.Exit\n4.Search By Name");
			System.out.println("Enter your choice");
			choice=Utility.integerInput();
			switch(choice)
			{
			case 1:
				operations.addDoctor();
				break;
			case 2:
				operations.addPatients();
				break;
			case 3:
				System.out.println("Terminated............");
				System.exit(0);
			case 4:
				operations.searchByName();
				break;
			default:
				System.out.println("Wrong entry");
				break;
			}
			
		}while(choice<5);
		
		
		
	}

}
