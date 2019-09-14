package com.bridgelabzs.OOPConcepts.AddressBookNew;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabzs.utility.Utility;

public class AddressBookMainNew {

	@SuppressWarnings("unchecked")
	static ObjectMapper mapper;
	static
	{
		mapper=new ObjectMapper();
	}
	public static void main(String[] args) throws IOException
	{
		
		File personFile=new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/AddressBookNew.json");
//		List<AddressBookNew> personList=mapper.readValue(personFile, new TypeReference <List <AddressBookNew> >(){ });
		Scanner scanner=new Scanner(System.in);
		List<AddressBookNew> addressBookList=new ArrayList<AddressBookNew>();
//		PersonNew person=new PersonNew();
//	AddressBookNew addressBookNew=new AddressBookNew();
		
		int choice =0;
		do
		{
			
			System.out.println("1.Add New Person \n2.Update Details \n3.Save File \n4.Show Details \n5.Exit");
			System.out.println("Enter Your Choice");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1 :
				
				//byte[] jsonData = Files.readAllBytes(Paths.get("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/AddressBookNew.json"));
				 //mapper.writeValue(file, wtf);
				//Employee emp = mapper.readValue(jsonData, Employee.class);
				PersonNew person=new PersonNew();
				 BufferedReader br = new BufferedReader(new FileReader("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/AddressBookNew.json"));
				AddressBookNew addressBookNew=new AddressBookNew();
				
				//addressBookNew=mapper.readValue(br, AddressBookNew.class);
				//System.out.println(addressBookNew);
				//addressBookNew=mapper.readValue(jsonData,AddressBookNew.class);
				 //mapper.writerWithDefaultPrettyPrinter().writeValue(new File("home/user/Desktop/Vaibhav_VK/Fellowship/JSON/AddressBookNew.json"), addressBookList);
				person= AddressBookUtility.personDetails();
				addressBookNew.setPerson(person);
				addressBookList.add(addressBookNew);
				mapper.writerWithDefaultPrettyPrinter().writeValue(new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/AddressBookNew.json"), addressBookList);
				 Utility.writeObjectToJson(addressBookList, "AddressBookNew.json");
				   //addressBookList.clear();
				
				break;
			case 2:
				break;
			case 3:
				AddressBookUtility.prityPrinter(addressBookList);
				break;
			case 4:
				System.out.println(addressBookList.toString());
				break;
			case 5:
				System.out.println("Terminated");
				System.exit(0);
				
				break;
			default:
				System.out.println("Wrong Choice");
				break;	
			}
			
		}while(choice<6);
		
	}
}
/*
package com.journaldev.jackson.json;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.journaldev.jackson.model.Address;
import com.journaldev.jackson.model.Employee;


public class JacksonObjectMapperExample {

	public static void main(String[] args) throws IOException {
		
		//read json file data to String
		byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));
		
		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		
		//convert json string to object
		Employee emp = objectMapper.readValue(jsonData, Employee.class);
		
		System.out.println("Employee Object\n"+emp);
		
		//convert Object to json string
		Employee emp1 = createEmployee();
		//configure Object mapper for pretty print
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		
		//writing to console, can write to any output stream such as file
		StringWriter stringEmp = new StringWriter();
		objectMapper.writeValue(stringEmp, emp1);
		System.out.println("Employee JSON is\n"+stringEmp);
	}
	
	public static Employee createEmployee() {

		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("David");
		emp.setPermanent(false);
		emp.setPhoneNumbers(new long[] { 123456, 987654 });
		emp.setRole("Manager");

		Address add = new Address();
		add.setCity("Bangalore");
		add.setStreet("BTM 1st Stage");
		add.setZipcode(560100);
		emp.setAddress(add);

		List<String> cities = new ArrayList<String>();
		cities.add("Los Angeles");
		cities.add("New York");
		emp.setCities(cities);

		Map<String, String> props = new HashMap<String, String>();
		props.put("salary", "1000 Rs");
		props.put("age", "28 years");
		emp.setProperties(props);

		return emp;
	}

}

}
*/
