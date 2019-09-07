package com.bridgelabzs.OOPConcepts;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JSONInventory 
{
	private static final ObjectMapper mapper=new ObjectMapper();
			
	public static void main(String[] args) throws JsonMappingException
	{
		File file=new File("/home/user/Desktop/Vaibhav_VK/Fellowship/InventoryDetails.json");
		JsonNode root;
		try {
			root = mapper.readTree(file);
			String name="";
			int weigth=0;
			int price=0;
			JsonNode nameNode=root.path("Rice");
			System.out.println("Rice Name : " + nameNode.get("name").asText());
            System.out.println(" Weigth: " + nameNode.get("weigth").asInt());
            System.out.println("Price : " + nameNode.get("price").asInt());
            
            System.out.println(name);
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
	}

