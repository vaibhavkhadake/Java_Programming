/******************************************************************************
 *  
 *  Purpose: Inventory Management
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   09/09/2019
 *
 ******************************************************************************/
package com.bridgelabzs.OOPConcepts;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryManagement 
{
	
	public static void main(String[] args) throws IOException 
	{
		//file path
		String filename="/home/user/Desktop/Vaibhav_VK/Fellowship/InventoryDetails.json";
		File file=new File(filename);
		ObjectMapper mapper=new ObjectMapper();
		try
		{
			//Read file 
			JsonNode rootNode=mapper.readTree(file );
			JsonNode inventoryRice=rootNode.findPath("Rice");
			//for Rice
			for(JsonNode jnode:inventoryRice)
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
			//for pulse
			JsonNode inventoryPulse=rootNode.findPath("Pulse");
			for(JsonNode jnode:inventoryPulse)
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
			//for wheats
			JsonNode inventoryWheats=rootNode.findPath("Wheats");
			for(JsonNode jnode:inventoryWheats)
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
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
