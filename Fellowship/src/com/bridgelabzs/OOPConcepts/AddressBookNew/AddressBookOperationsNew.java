package com.bridgelabzs.OOPConcepts.AddressBookNew;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.bridgelabzs.utility.Utility;

public class AddressBookOperationsNew 
{
	List<String> fileList=new ArrayList<String>();
	
	
	public String addNewJsonFile() throws IOException
	{
		System.out.println("Enter File name to Add new person details or create new file and Add new person details");
		String fileName=Utility.stringInput();
		File file=new File(fileName+".json");

		try
		{
			if(file.createNewFile())
			{	
			System.out.println("New File Created Successfully Please fill person details");
			}
			else
			{
			System.out.println("File Already Exist Please update person details");
			
			
			File listOfFiles = new File("/home/user/Desktop/Vaibhav_VK/Fellowship/demo.txt");
			FileWriter write = new FileWriter(listOfFiles, true);
			BufferedWriter br = new BufferedWriter(write);
			br.write(fileName);
			br.flush();

		//	AddressBookUtility.writeToJsonFile(personList);
			}
		}catch(IOException e)
		{
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
		fileList.add(fileName);
		return fileName;
		}
	public void sort()
	{
		AddressNew address=new AddressNew();
		
		
		
	}
	}
