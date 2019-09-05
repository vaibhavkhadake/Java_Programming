package com.bridgelabzs.OOPConcepts;
import java.io.File;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.bridgelabzs.utility.Utility;

public class Inventory
{
	private String name;
	private int weight;
	private int price;
	
	@Override
	public String toString() {
		return "Inventory [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}

	public Inventory(String name, int weight, int price)
	{
		this.name=name;
		this.weight=weight;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void main(String[] args) throws JSONException, JsonGenerationException, JsonMappingException, IOException
	{
		JSONObject obj=new JSONObject();
		JSONArray jarray=new JSONArray();
		
		String name=" ";
		int weight=0;
		int price=0;
		int choice=0;
		Scanner scanner=new Scanner(System.in);
		ObjectMapper mapper=new ObjectMapper();
		try
		{
		do
		{
			System.out.println("---------Inventory Details----------");
			System.out.println("Enter your choice ");
			System.out.println("Press\n 1.Rice\t2.Pulse\t3.Wheats \n");
		    choice=Utility.integerInput();
		   
			switch(choice)
			{
				case 1:
			
					System.out.println("Enter product name");
					name=scanner.nextLine();
					System.out.println("Enter product weight");
					weight=Utility.integerInput();
					System.out.println("Enter product price");
					price=Utility.integerInput();
					Inventory inventory=new Inventory(name,weight,price);
					System.out.println(inventory);
					mapper.writeValue(new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/Rice.json"), inventory);
					//mapper.readTree("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/Wheats.json");

				break;
				
			case 2:
				
					System.out.println("Enter product name");
					name=scanner.nextLine();
					System.out.println("Enter product price");
					price=Utility.integerInput();
					System.out.println("Enter product weight");
					weight=Utility.integerInput();
	
					Inventory inventory2=new Inventory(name,weight,price);
					System.out.println(inventory2);
					mapper.writeValue(new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/Pulse.json"), inventory2);
				    
				break;
			case 3:
					
					System.out.println("Enter product name");
					name=scanner.nextLine();
					System.out.println("Enter product weight");
					weight=Utility.integerInput();
					System.out.println("Enter product price");
					price=Utility.integerInput();
					
					Inventory inventory3=new Inventory(name,weight,price);
					System.out.println(inventory3);
					mapper.writeValue(new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/Wheats.json"), inventory3);
				    
				break;
			default:
				System.out.println("Please Enter valid choice");
			}
		}while(choice>4);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	
		scanner.close();
	}

}
