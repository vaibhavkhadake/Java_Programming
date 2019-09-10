package com.bridgelabzs.OOPConcepts;

import java.io.File;  
import java.io.FileWriter;  
import java.io.IOException;  

import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;

import com.bridgelabzs.utility.Utility;

public class StockAccount {  
	private static int totalAmount=10000;
	private int totalShare;
	private int shareAmount;
	
	public static void buy()
	{
		System.out.println("Enter share amount");
		int shareAmount=Utility.integerInput();
		if(shareAmount<=totalAmount)
		{
			totalAmount=totalAmount-shareAmount;
			System.out.println("Share Purchased Successfully");
		}
		else
		{
			System.out.println("You have insufficient balance to purchase share");
		}
	}
	public static void sell()
	{
		
	}
    public static void main(String[] args) {  

        JSONObject countryObj = new JSONObject();  
//        countryObj.put("Name", "India");  
//        countryObj.put("Population",1000000);  
//
//        JSONArray listOfStates = new JSONArray();  
//        listOfStates.add("Madhya Pradesh");  
//        listOfStates.add("Maharastra");  
//        listOfStates.add("Rajasthan");  
//
//        countryObj.put("States", listOfStates);  

        
        
        try {  

            // Writing to a file  
            File file=new File("/home/user/Desktop/SurajFile.json");  
            file.createNewFile();  
            FileWriter fileWriter = new FileWriter(file);  
            System.out.println("Writing JSON object to file");  
            System.out.println("-----------------------");  
            System.out.print(countryObj);  

            fileWriter.write(countryObj.toJSONString());  
            fileWriter.flush();  
            fileWriter.close();  

        } catch (IOException e) {  
            e.printStackTrace();  
        }  

    }  
}  
