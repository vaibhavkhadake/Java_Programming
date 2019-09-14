package com.bridgelabzs.OOPConcepts.AddressBookNew;

import java.io.File;
import java.io.IOException;
import com.bridgelabzs.utility.Utility;

public class AddressBookOperationsNew 
{
	
	
	public void addNewJsonFile() throws IOException
	{
		System.out.println("Enter File name to create new file");
		String fileName=Utility.stringInput();
		File file=new File(fileName+".json");
		if(file.createNewFile())
		{
			System.out.println("New File Created Successfully");
			
		}
		else
		{
			System.out.println("File Already Exist");
			//AddressBookUtility.writeToJsonFile(personList);
		}
	}
	
	public void addPersonInformationInFile()
	{
	
	}
}
