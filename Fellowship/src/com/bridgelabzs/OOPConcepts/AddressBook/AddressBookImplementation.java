package com.bridgelabzs.OOPConcepts.AddressBook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.map.type.CollectionType;

import com.bridgelabzs.utility.Utility;

public class AddressBookImplementation 
{
	private static List<AddressBook> addressBookList=new ArrayList<AddressBook>();
	static ObjectMapper mapper=new ObjectMapper();
	static int choice=0;
	public static void setDetails() throws IOException
	{
		
		do
		{
			System.out.println("\n1.Add \n2.delete");
			choice=Utility.integerInput();
			AddressBook addressBook=new AddressBook();
			switch(choice)
			{
			case 1:
				
				addressBook.setFirstName();
				addressBook.setLastName();
				System.out.println("Address");
				addressBook.setCity();
				addressBook.setState();
				addressBook.setPinCode();
				addressBook.setMobileNumber();
				addressBookList.add(addressBook);
				JsonFileOperations.createNewFile();
				break;
			case 2:
				addressBookList.remove(0);
				break;
				default:
					System.out.println("Wrong choice");
					break;
			}
		}while(choice!=5);
		
		
	}
	
	public static void display()
	{
		addressBookList.forEach(addressBook->{
		System.out.println("First Name is 	: "+addressBook.getFirstName());	
		System.out.println("Last Name is	: "+addressBook.getLastName());
		System.out.println("City Name is	: "+addressBook.getCity());
		System.out.println("State Name is	: "+addressBook.getState());
		System.out.println("Pincode is	: "+addressBook.getPinCode());
		System.out.println("Mobile Number is: "+addressBook.getMobileNumber());	
		});
	}
	public static void writeToJsonFile(List<AddressBook> addressBookList2) throws JsonGenerationException, JsonMappingException, IOException
	{
	mapper.writeValue(new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/AddressBook.json"), addressBookList2);
	System.out.println("Wrote Successfully");
	}
	
	public static void prettyPrint(List<AddressBook> addressBookList2) throws JsonGenerationException, JsonMappingException, IOException
	{
	ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
	writer.writeValue(new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/AddressBook.json"), addressBookList2);
	}
	public static void prettyPrint(List<AddressBook> addressBookList2, File filename) throws JsonGenerationException, JsonMappingException, IOException
	{
	ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
	writer.writeValue(filename, addressBookList2);
	}
	
	public static <T> List<T> userReadValue(String str, Class<?> clazz)
			throws JsonParseException, JsonMappingException, IOException 
	{
		CollectionType colletion = mapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);
		return mapper.readValue(str, colletion);
	}

	
	
	public static <T> String userWriteValueAsString(List<T> list)
			throws JsonGenerationException, JsonMappingException, IOException {
		return mapper.writeValueAsString(list);
	}
	public static String readJsonFile(String filename) throws IOException {
		FileReader fileReader = new FileReader(filename);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String string = "";
		String line = "";
		while ((line = bufferReader.readLine()) != null) {
			string += line;
		}
		bufferReader.close();
		return string;
	}
	public static void writeFile(String json, String filename) throws IOException
	{
		FileWriter fileWriter = new FileWriter(filename);
		BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
		bufferWriter.write(json);
		bufferWriter.close();
	}
	
	public static <T> void writeToFile(String filename,List<T> list) throws JsonGenerationException, JsonMappingException, IOException {
		String jsonString = userWriteValueAsString(list);
		writeFile(jsonString, filename);
	}
	
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		//AddressBook addressBook=new AddressBook();
		AddressBookImplementation.setDetails();
		AddressBookImplementation.display();
		//AddressBookImplementation.writeToJsonFile(addressBookList);
		AddressBookImplementation.prettyPrint(addressBookList);

	}
	

}
