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
				System.out.println("Enter your choice ");
				System.out.println("Press\n 1.Rice\t2.Pulse\t3.Wheats \n");
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
			JsonNode inventry=node.get(product);
			for(JsonNode jnode:inventry)
			{
				String product_name="";
				int product_price=0;
				int product_weight=0;
				
				product_name=jnode.get(product_name).asText();
				product_weight=jnode.get(product_weight).asInt();
				product_price=jnode.get(product_price).asInt();
				
				System.out.println("Product Name		:"+product_name);
				System.out.println("Product Weigth 		:"+product_weight);
				System.out.println("Product Price per Kg:"+product_price);
				double total_price=product_price*product_weight;
				System.out.println("Product Final Price :"+total_price);
			}
			
			}while(choice>4);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
//		//JSON nn=mapper.
//		JSONObject obj=new JSONObject();    
//		  obj.put("Product name","Suraj");    
//		  obj.put("product weight",10);    
//		  obj.put("product price",500);    
//		  System.out.print(obj);  
//		JSONArray employeeList = new JSONArray();
//        employeeList.add(employeeObject);
//		 try (FileWriter file = new FileWriter("employees.json")) {
//			 
//	            file.write(employeeList.toJSONString());
//	            file.flush();
//	 
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
	}

}
