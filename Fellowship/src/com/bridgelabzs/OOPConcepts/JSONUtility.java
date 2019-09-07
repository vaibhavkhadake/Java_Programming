package com.bridgelabzs.OOPConcepts;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.JSONException;

public class JSONUtility
{
	public static void main(String[] args) throws JSONException 
	{
		String file="/home/user/Desktop/Vaibhav_VK/Fellowship/InventoryDetails.json";
		
		JSONObject obj=new JSONObject();
		JSONObject obj2=new JSONObject();
		JSONObject obj3=new JSONObject();
		JSONArray array=new JSONArray();

		JSONArray array2=new JSONArray();
		
		obj.put("Rice", array);
		
		array.add(obj2);
		array.add(obj3);
		
		
		obj2.put("Rice Name", "basamati");
		obj2.put("Rice Weight",50);
		obj2.put("Rice Price", 100);
	
		obj3.put("Rice Name", "Rajama");
		obj3.put("Rice Weight",50);
		obj3.put("Rice Price", 100);
		
		
		try
		{
			@SuppressWarnings("resource")
			FileWriter fileWriter = new FileWriter(file,true);
			fileWriter.write(obj.toJSONString());
			fileWriter.flush();
			
		}catch(Exception e)
		{
			System.out.println("File Not found"+e);
		}
		
	}

}
