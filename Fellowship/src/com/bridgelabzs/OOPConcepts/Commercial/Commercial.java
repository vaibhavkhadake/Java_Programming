package com.bridgelabzs.OOPConcepts.Commercial;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabzs.utility.Utility;

public class Commercial {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		Person person = new Person();
		Company company= new Company();
		ObjectMapper mapper=new ObjectMapper();
		File personFile=new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/Person.json");
		File companyFile=new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/Company.json");
		
		List<Person> personList=mapper.readValue(personFile, new TypeReference <List <Person> >(){ });
		
		List<Company> companyList=mapper.readValue(companyFile, new TypeReference <List <Company> >(){ });
		int choice=0;
		do
		{
			//System.out.println("Press \n1.Buy Share\n2.Sell Share\n3.Save File\n4.Print Report\n5.Exit");
			System.out.println("Press \n1.Buy Share\n2.Sell Share\n3.Print Report\n4.Exit");
			choice=Utility.integerInput();
			
			
			switch (choice)
			{
			case 1:
				System.out.println("Enter index of person");
				int indexPerson=Utility.integerInput();
				person=personList.get(indexPerson);
				System.out.println(person.toString());
				
				System.out.println("Enter index of company");
				int indexCompany=Utility.integerInput();
				company=companyList.get(indexCompany);
				System.out.println(company.toString());
				
				System.out.println("Enter how many share to buy : ");
				int numberOfShares=Utility.integerInput();	
				
				if(numberOfShares>company.getNumberOfShares())
				{
					System.out.println("Sorry you cant buy shares");
				}
				else
				{
					//call buyshare method to buy share
					int amount=CommercialOperations.buyShares(person.getBalance(), numberOfShares, company.getShareAmount());
					int availableSharesInCompany=company.getNumberOfShares();
					availableSharesInCompany=availableSharesInCompany-numberOfShares;
					person.setBalance(amount);
					
					int availableShareInPerson=person.getNumberOfShares();
					availableShareInPerson=availableShareInPerson-numberOfShares;
					person.setNumberOfShares(availableShareInPerson);	
					
				}
				break;
			case 2:
				System.out.println("Enter index of person");
				int indexPerson2=Utility.integerInput();
				person=personList.get(indexPerson2);
				System.out.println(person.toString());
				
				System.out.println("Enter index of company");
				int indexCompany2=Utility.integerInput();
				company=companyList.get(indexCompany2);
				System.out.println(company.toString());
				
				System.out.println("Enter how many share to sell : ");
				int numberOfShares2=Utility.integerInput();	
				if(numberOfShares2>company.getNumberOfShares())
				{
					System.out.println("Sorry you cant buy shares");
				}
				else
				{
					//call sellshare method to buy share
					int amount2=CommercialOperations.sellShares(person.getBalance(), numberOfShares2, company.getShareAmount());
					int availableSharesInCompany=company.getNumberOfShares();
					availableSharesInCompany=availableSharesInCompany-numberOfShares2;
					person.setBalance(amount2);
					
					int availableShareInPerson=person.getNumberOfShares();
					availableShareInPerson=availableShareInPerson+numberOfShares2;
					person.setNumberOfShares(availableShareInPerson);	
				}
				break;
			case 3:
				Utility.writeObjectToJson(personList, "Person.json");
				System.out.println(personList);
				
				Utility.writeObjectToJson(companyList, "Company.json");
				System.out.println(companyList);
				break;
			case 4:
				System.exit(0);
				default:
					System.out.println("Wrong Input");
			}
		}while(choice<5);
		
//		Utility.writeObjectToJson(personList, "Person.json");
//		System.out.println(personList);
//		
//		Utility.writeObjectToJson(companyList, "Company.json");
//		System.out.println(companyList);
		
	}

}
