/******************************************************************************
 *  
 *  Purpose: Json read and write operations.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   09/09/2019
 *
 ******************************************************************************/
package com.bridgelabzs.OOPConcepts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;

public class JSONUtility2 <E>
{
	private static ObjectMapper mapper;
	static
	{
		mapper=new ObjectMapper();
	}
	
	public static <T> List<T> userReadValue(String str, Class<?> clazz)
			throws JsonParseException, JsonMappingException, IOException {
		CollectionType colletion = mapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);
		return mapper.readValue(str, colletion);
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
