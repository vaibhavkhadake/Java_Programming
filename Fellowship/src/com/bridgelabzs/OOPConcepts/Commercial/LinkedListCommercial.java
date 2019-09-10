package com.bridgelabzs.OOPConcepts.Commercial;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabzs.datastructure.Linked_List;

public class LinkedListCommercial {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		Linked_List<Company> list=new Linked_List<Company>();
	
		ObjectMapper mapper=new ObjectMapper();

		File companyFile=new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/Company.json");
		
		List<Company> companyList=mapper.readValue(companyFile, new TypeReference <List <Company> >(){ });
		
		for(int i=0;i<companyList.size();i++)
		{
			list.addAtBeggining(companyList.get(i));
		}
		list.display();
		//Delete the element in the linked list throught position
		list.atDelete(1);
		
		list.display();
	}

}
