package com.bridgelabzs.OOPConcepts.Commercial;

//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//import org.json.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//import com.bridgelabzs.OOPConcepts.*;
public class CommercialOperations
{
	static Company company=new Company();
	public static  int buyShares(int balance,int noOfShares,int shareAmount)
	{
		int paidAmount=noOfShares*shareAmount;
		System.out.println("Amount to purchase share : "+paidAmount);
		return (balance-paidAmount);
	}
	
	public static int sellShares(int balance,int noOfShares,int shareAmount)
	{
		int sellAmount=noOfShares*shareAmount;
		System.out.println("After sell share new total balance : "+(balance+sellAmount));
		return (balance+sellAmount);
	}
//	public static void newAccount(String companyName,int noOfShares,int shareAmount) throws FileNotFoundException, IOException, ParseException
//	{
//		JSONParser parser = new JSONParser();		 
//		JSONObject jsonObj = (JSONObject)parser.parse(new FileReader("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/Person.json"));
//		JSONObject object=new JSONObject();
//		JSONArray array=new JSONArray();
//		object.put("companyName",company.getCompanyName());
//	}
}
