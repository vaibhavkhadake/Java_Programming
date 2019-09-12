package com.bridgelabzs.OOPConcepts.AddressBook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;

import com.bridgelabzs.utility.Utility;

public class JsonFileOperations 
{
	public static List<AddressBook> addressBookList=new ArrayList<AddressBook>();
	public static List<String> fileList=new ArrayList<String>();
	ObjectMapper mapper=new ObjectMapper();
	private AddressBook addressBook = null;
	private static String searchFileName;
	public static File[] getFile()
	{
		return new File(System.getProperty("/home/user/Desktop/Vaibhav_VK")).listFiles();
		
	}
	public static void createNewFile() throws IOException
	{
		System.out.println("Enter file name to create");
		String newFileName=Utility.stringInput();
		File file=new File(newFileName+".json");
		if(file.createNewFile())
		{
			System.out.println("New File Created Successfully");
		}
		else
		{
			System.out.println("File is already Exist");
		}
		File[] path=getFile();
		System.out.println(path);
		fileList.add(newFileName);
		
	}
	public static void openBook() throws IOException
	{
		System.out.println("JSON File List :");
		File[] arrayOfFile=getFile();
		for(File file:arrayOfFile)
		{
			if(file.getName().endsWith(".json"))
			{
				System.out.println(file.getName());
			}
		}
		System.out.println("Enter address book name");
		searchFileName=Utility.stringInput();
		
		for (File file : arrayOfFile) 
		{
			String filename = file.getName();
			
			if (searchFileName.equals(filename)) 
			{
				if (file.length() > 0) 
				{
					System.out.println("Address book is not empty");
					String string=AddressBookImplementation.readJsonFile(filename);
					addressBookList=AddressBookImplementation.userReadValue(string, AddressBook.class);
				}
				else
				{
					System.out.println("Address book is empty");
				}
			}
		}	
	}
//	public static void saveBook()
//	{
//		File[] arrayOfFiles = getFile();
//		for (File file : arrayOfFiles) {
//			String filename = file.getName();
//			if (searchFileName.equals(filename)) {
//				try {
//					String json = AddressBookImplementation.userWriteValueAsString(addressBookList);
//					AddressBookImplementation.writeFile(json, filename);
//					System.out.println("Address book details saved");
//				} catch (Exception e) {
//					System.out.println("Cannot write to file");
//				}
//			}
//		}
//	}
	
//	public void saveAsBook() throws IOException {
//		System.out.println("Files available are:");
//		File[] arrayOfFiles = getFile();
//		for (File file : arrayOfFiles)
//		{
//			if (file.getName().endsWith(".json"))
//			{
//				System.out.println(file.getName());
//			}
//		}
//		System.out.println("Enter file name to save as");
//		String saveAsBook = Utility.stringInput();
//		File file = new File(saveAsBook);
//		if (file.createNewFile())
//		{
//			System.out.println("File is created");
//			String json = AddressBookImplementation.userWriteValueAsString(addressBookList);
//			AddressBookImplementation.writeFile(json, searchFileName);
//			System.out.println("Address book details saved");
//		} else
//		{
//			System.out.println("File of that name already exists");
//		}
//	}
//	
//	public void close() {
//		System.out.println("Would you like to save the changes? Y / N");
//		String answer = Utility.stringInput();
//		if (answer.equalsIgnoreCase("Y")) 
//		{
//			saveBook();
//		}
//		addressBook = null;
//	}
	public static void main(String[] args) throws IOException {
		//AddressBook addressBook=new AddressBook();
		JsonFileOperations.createNewFile();
		
		
	}
}
