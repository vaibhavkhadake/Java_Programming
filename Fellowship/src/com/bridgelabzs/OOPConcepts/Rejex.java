package com.bridgelabzs.OOPConcepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rejex {
	public static String display(String name,String full_name,String Mob_number,String display)
	{
		display=display.replaceAll("name",name);
		display=display.replaceAll("<<full_names>>",full_name);
		display=display.replaceAll("91­xxxxxxxxxx", Mob_number);
		return display;
	}
	

	public static void main(String[] args) {
				String st="Hello name, We have your full_name \n" + 
				"as <<full_names>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us\n" + 
				"know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		String name="Vaibhav";
		String full_name="VK_Khadake";
		String mobile_Number= "919503359498";
		Matcher m = p.matcher(mobile_Number);
		String s=Rejex.display(name, full_name, mobile_Number, st);
		System.out.println(s);
		
		//System.out.println(display);

	}

}
