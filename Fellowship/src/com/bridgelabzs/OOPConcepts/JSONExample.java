/******************************************************************************
 *  
 *  Purpose: Read JSON file
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   09/09/2019
 *
 ******************************************************************************/
package com.bridgelabzs.OOPConcepts;

import java.io.File;
import java.io.FileWriter;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.bridgelabzs.utility.Utility;

public class JSONExample {

	public static void main(String[] args) throws JSONException 
	{
		//file path
		File file=new File("/home/user/Desktop/Vaibhav_VK/Fellowship/InventoryDetails.json");
		ObjectMapper mapper=new ObjectMapper();
		int choice=0;
		String product="";
		try
		{
			JsonNode node=mapper.readTree(file);
			System.out.println(node);
			do
			{
				System.out.println("---------Inventory Details----------");
				System.out.println("Press\n 1.Rice\t2.Pulse\t3.Wheats \n");
				System.out.println("Enter your choice ");
				choice=Utility.integerInput();
				switch(choice)
				{
				case 1:
					product="Rice";
					break;
				case 2:
					product="Pulse";
					break;
				case 3:
					product="Wheats";
					break;
				default:
					System.out.println("Please Enter valid choice");
				}
				//Searching String specific data
			JsonNode inventry=node.findPath(product);
			for(JsonNode jnode:inventry)
			{
				
			String	product_name=jnode.findPath("Name").asText();
			int	product_weight=jnode.findPath("Weight").asInt();
			int	product_price=jnode.findPath("Price").asInt();
				
				System.out.println("Product Name			:"+product_name);
				System.out.println("Product Weigth			:"+product_weight);
				System.out.println("Product Price per Kg		:"+product_price);
				double total_price=product_price*product_weight;
				System.out.println("Product Final Price		:"+total_price);
				System.out.println();
			}
			
			}while(choice<4);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
