package com.bridgelabzs.OOPConcepts.AddressBookNew;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;


public class AddressBookUtility
{
	static ObjectMapper mapper;
	static
	{
		mapper=new ObjectMapper();
	}
	static PersonNew person=new PersonNew();
	static AddressNew address=new AddressNew();
	
	public static PersonNew personDetails()
	{
		person.setPersonFirstName();
		person.setPersonLastName();
		person.setAddress(address);
		person.setMobileNumber();
		return person;
	}
	
	public static void prityPrinter(List<AddressBookNew> person) throws JsonGenerationException, JsonMappingException, IOException
	{
	ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
	writer.writeValue(new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/AddressBookNew.json"), person);
	System.out.println("Person Data added Successfully");
	}
	
	
	public static void writeToJsonFile(List<AddressBookNew> person) throws JsonGenerationException, JsonMappingException, IOException
	{
	mapper.writeValue(new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/AddressBookNew.json"), person);
	System.out.println("Person Data added Successfully");
	}
}
