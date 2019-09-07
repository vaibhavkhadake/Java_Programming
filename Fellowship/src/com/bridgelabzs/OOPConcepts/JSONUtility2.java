package com.bridgelabzs.OOPConcepts;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JSONUtility2 <E>
{
	private static ObjectMapper mapper;
	static
	{
		mapper=new ObjectMapper();
	}
	public static String convertJavaToJson(Object object)
	{
		String JsonResult="";		
		try {
			
			JsonResult=mapper.writeValueAsString(object);
			
		} catch (JsonGenerationException e) {
			System.out.println("Exception Occured"+e.getMessage());
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.out.println("Exception Occured"+e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception Occured"+e.getMessage());
			e.printStackTrace();
		}
		return JsonResult;
	}
	
	public static <E> E convertJsonToJava(String jsonString,Class<E> cls )
	{
		E javaresult=null;
		
		try {
			javaresult=mapper.readValue(jsonString, cls);
		} catch (JsonParseException e) {
			System.out.println("Exception Occured"+e.getMessage());
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.out.println("Exception Occured"+e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception Occured"+e.getMessage());
			e.printStackTrace();
		}
		return javaresult;
		
	}
}
