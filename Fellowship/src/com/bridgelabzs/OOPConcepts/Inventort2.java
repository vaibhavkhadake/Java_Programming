package com.bridgelabzs.OOPConcepts;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabzs.utility.Utility;

public class Inventort2 
{
	private String productName;
	private int productWeight;
	private int productPrice;
	

	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
	
		this.productName = productName;
	}


	public int getProductWeight() {
		return productWeight;
	}


	public void setProductWeight(int productWeight) {
		
		this.productWeight = productWeight;
	}


	public int getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(int productPrice) {
		
		this.productPrice = productPrice;
	}


	@Override
	public String toString() {
		return "Inventort2 [productName=" + productName + ", productWeight=" + productWeight + ", productPrice="
				+ productPrice + "]";
	}


	public static void main(String[] args)
	{
		JSONObject object1=new JSONObject();
		JSONObject object2=new JSONObject();
		JSONArray array=new JSONArray();
		Inventort2 inventory=new Inventort2();
		
		System.out.println("Enter Product Name :");
		String productName=Utility.stringInput();
		System.out.println("Enter Product Weight :");
		int productWeight=Utility.integerInput();
		System.out.println("Enter Product price :");
		int productPrice=Utility.integerInput();
		inventory.setProductName(productName);
		inventory.setProductWeight(productWeight);
		inventory.setProductPrice(productPrice);
		
		object1.put("Rice", array);
		array.add(object2);
		object2.put("Product Name", productName);
		object2.put("Product weigth", productWeight);
		object2.put("Product Price", productPrice);
		

		try
		{
			@SuppressWarnings("resource")
			FileWriter fileWriter = new FileWriter("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/Rice.json",true);
			fileWriter.write(object1.toJSONString());
			fileWriter.flush();
			
		}catch(Exception e)
		{
			System.out.println("File Not found"+e);
		}
		
		
	}

}
