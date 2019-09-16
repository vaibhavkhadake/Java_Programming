package com.bridgelabzs.OOPConcepts.AddressBookNew;


import java.io.File;


import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabzs.OOPConcepts.AddressBook.AddressBook;


public class AddressBookMainNew {

	@SuppressWarnings("unchecked")
	static ObjectMapper mapper;
	static
	{
		mapper=new ObjectMapper();
	}
	public static void main(String[] args) throws IOException
	{
		
		
		Scanner scanner=new Scanner(System.in);
		AddressBookOperationsNew addressBookOperationsNew=new AddressBookOperationsNew();
		List<AddressBookNew> addressBookList=new ArrayList<AddressBookNew>();
		AddressBookNew addressBookNew=new AddressBookNew();
		PersonNew person=new PersonNew();
		AddressNew address=new AddressNew ();
		//List<AddressNew> addressList=new ArrayList<AddressNew>();
		int choice =0;
		do
		{
			System.out.println("1.Create a New Person  \n2.Update Details \n3.Sort by PinCode \n4.Show Details \n5.Exit");
			System.out.println("Enter Your Choice");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1 :
				
				String fileName=addressBookOperationsNew.addNewJsonFile();
				person= AddressBookUtility.personDetails();
				address=AddressBookUtility.personAddress();
				addressBookNew.setPerson(person);
				addressBookNew.setAddress(address);
				addressBookList.add(addressBookNew);
				AddressBookUtility.prityPrinter(addressBookList,fileName);
				break;
			case 2:
				String fileName2=addressBookOperationsNew.addNewJsonFile();
				File file=new File(fileName2+".json");
				List<AddressBookNew> personFileList = mapper.readValue(file, new TypeReference<List<AddressBookNew>>() {});
				addressBookList.addAll(personFileList);
				person= AddressBookUtility.personDetails();
				address=AddressBookUtility.personAddress();
				addressBookNew.setPerson(person);
				addressBookNew.setAddress(address);
				addressBookList.add(addressBookNew);
				AddressBookUtility.prityPrinter(addressBookList,fileName2);
				
				break;
			case 3:
				
				System.out.println("Enter file name to sort elements");
				String sortNameString=scanner.next();
				File sortFile=new File(sortNameString+".json");
				System.out.println(addressBookList.toString());
				List<AddressNew> addressFileList = mapper.readValue(sortFile, new TypeReference<List<AddressNew>>() {});
				Collections.sort(addressFileList, new  SortByPinCode());
				for(AddressNew an:addressFileList)
				{
					System.out.println(an);
				}
				System.out.println(addressFileList);
					
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
		scanner.close();
	}
}
