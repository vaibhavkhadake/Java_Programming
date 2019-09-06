package com.bridgelabzs.OOPConcepts;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONUtility
{
	public static void main(String[] args) throws JSONException 
	{
		String file="/home/user/Desktop/Vaibhav_VK/Fellowship/InventoryDetails.json";
		
		JSONObject obj=new JSONObject();
		obj.put("RiceName", "Indrayani");
		obj.put("Rice weight", 50);
		obj.put("Rice price", 50);
		
		
	}

}
