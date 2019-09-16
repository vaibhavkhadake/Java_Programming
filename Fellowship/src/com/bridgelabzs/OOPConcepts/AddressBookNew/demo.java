package com.bridgelabzs.OOPConcepts.AddressBookNew;

public class demo {
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	import org.codehaus.jackson.map.ObjectMapper;
	import org.codehaus.jackson.type.TypeReference;

	import com.bridgelabz.utility.Utility;


	public class AddressBookMain 
	{

		
		public static void main(String[] args) throws IOException 
		{
			ObjectMapper objectMapper = new ObjectMapper();
			List<Person> personArrayList = new ArrayList<>();
			List<Address> AddressList = new ArrayList<>();
			List<AddressBook> addressBookList = new ArrayList<AddressBook>();
			List<String> fileList = new ArrayList<String>();
//			Person person = new Person();
//			person.setFirstName();
//			person.setLastName();
//			person.setContactNumber();
//			Address address = new Address();
//			address.setCity();
//			address.setState();
//			address.setPinCode();
//			person.setAddress(address);
//			AddressBook addressBook = new AddressBook();
//			addressBook.setPerson(person);
//			addressBookList.add(addressBook);
			
			int choice = 0;
			
			do
			{
				System.out.println("1. Add");
				System.out.println("2. Delete");
				System.out.println("3. Update");
				System.out.println("4. Exit");
				System.out.println("Enter Your Choice");
				choice = Utility.scanInt();
				
				switch(choice)
				{
					case 1:
						
						System.out.println("Enter File Name");
						String fileName = Utility.scanString();
						String path = fileName + ".json";
						try
						{
							File file = new File(path);
							boolean created = file.createNewFile();
							if(created)
							{
								System.out.println("File Has Been Created");
							}
							else
							{
								System.out.println("File Already Exists");	
							}
						}
						catch(IOException e)
						{
							System.out.println("Exception Occured");
							e.printStackTrace();
						}
						
						fileList.add(fileName);
						
						System.out.println(fileList);
						
						System.out.println("Enter File To write : ");
						String fileName2 = Utility.scanString();
						File fileObject = new File(fileName2 + ".json");
						
						if(fileObject.length() == 0)
						{
							Person person = new Person();
							person.setFirstName();
							person.setLastName();
							person.setContactNumber();
							Address address = new Address();
							address.setCity();
							address.setState();
							address.setPinCode();
							person.setAddress(address);
							AddressBook addressBook = new AddressBook();
							addressBook.setPerson(person);
							addressBookList.add(addressBook);
//							System.out.println(addressBookList);
//							System.out.println(addressBookList.toString());
							JsonUtility.prettyPrint(addressBookList,fileName);
							System.out.println(addressBookList.toString());
						}
						else
						{
							
							List<AddressBook> personFileList = objectMapper.readValue(fileObject, new TypeReference<List<AddressBook>>() {});
							addressBookList.addAll(personFileList);
							Person person = new Person();
							person.setFirstName();
							person.setLastName();
							person.setContactNumber();
							Address address = new Address();
							address.setCity();
							address.setState();
							address.setPinCode();
							person.setAddress(address);
							AddressBook addressBook = new AddressBook();
							addressBook.setPerson(person);
							addressBookList.add(addressBook);
							JsonUtility.prettyPrint(addressBookList,fileName);
							System.out.println(addressBookList.toString());
						}
						
//						BufferedReader br = new BufferedReader(new FileReader(fileName));
//									
//						String str = br.readLine();
//						
//						String tempStr = "";
//						
//						while(str!=null)
//						{
//							tempStr = tempStr + str + " ";
//							str = br.readLine();
//						}
//						
//						System.out.println(str);
//						
//						if(tempStr == "")
//						{
//							Person person = new Person();
//							person.setFirstName();
//							person.setLastName();
//							person.setContactNumber();
//							Address address = new Address();
//							address.setCity();
//							address.setState();
//							address.setPinCode();
//							person.setAddress(address);
//							AddressBook addressBook = new AddressBook();
//							addressBook.setPerson(person);
//							addressBookList.add(addressBook);
//							JsonUtility.prettyPrint(addressBookList);
//						}
//						else
//						{
//							
//						}
						
						break;
					case 2:
						addressBookList.remove(0);
						//JsonUtility.prettyPrint(addressBookList);
						break;
					
					default: System.out.println("Enter Correact Element");
				}
							
			}while(choice!=4);
			
			
			
			
		}

	}
}
