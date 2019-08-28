package com.bridgelabzs.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabzs.utility.Utility;

public class demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("/home/user/Desktop/Vaibhav_VK/sample");
		System.out.println("Enter element to search");
		String  search=Utility.stringInput();
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		 String temp="";
		FileWriter fw=new FileWriter(file,true);
		  BufferedWriter bw= new BufferedWriter(fw);
		  bw.write(search);

	}

}
