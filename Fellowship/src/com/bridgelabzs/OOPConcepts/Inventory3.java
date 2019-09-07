package com.bridgelabzs.OOPConcepts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Inventory3 {

	public static void main(String[] args) throws IOException 
	{
		
		File file=new File("/home/user/Desktop/Vaibhav_VK/Fellowship/InventoryDetails.json ");
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line; 
			  for((line = br.readLine()) != null) 
			  {
			    // process the line.
			  }
			  // line is not visible here.
			}
	}

}
