package com.bridgelabzs.OOPConcepts.CliniqueMnagement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabzs.OOPConcepts.AddressBookNew.AddressBookNew;
import com.bridgelabzs.utility.Utility;


public class Operations implements IClinique
{
	static ObjectMapper mapper=new ObjectMapper();
	Doctor doctorObject = new Doctor();
	Patients patientsObject=new Patients();
	List<Doctor> doctorList=new ArrayList<Doctor>();
	List<Patients> patientsList=new ArrayList<Patients>();
	
	
	@Override
	public void addDoctor() throws JsonGenerationException, JsonMappingException, IOException
	{
		File doctorFile=new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/DoctorDetails.json");
		if(doctorFile.length() == 0)
		{
		Doctor doctorObject = new Doctor();
		doctorObject.setDetails();
		doctorList.add(doctorObject);
		writeToJsonFile(doctorList, doctorFile);
		}
		else
		{
			List<Doctor> doctorFileList = mapper.readValue(doctorFile, new TypeReference<List<Doctor>>() {});
			doctorList.addAll(doctorFileList);
			doctorObject.setDetails();
			doctorList.add(doctorObject);
			writeToJsonFile(doctorList, doctorFile);
		}
	}

	@Override
	public void addPatients() throws JsonParseException, JsonMappingException, IOException
	{
		File patientsFile=new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/PatientsDetails.json");
		if(patientsFile.length() == 0)
		{
		Patients patientsObject = new Patients();
		patientsObject.setPersonDetails();
		patientsList.add(patientsObject);
		writeToJsonFile(patientsList, patientsFile);
		}
		else
		{
			List<Patients> patientFileList = mapper.readValue(patientsFile, new TypeReference<List<Patients>>() {});
			patientsList.addAll(patientFileList);
			patientsObject.setPersonDetails();
			patientsList.add(patientsObject);
			writeToJsonFile(patientsList, patientsFile);
		}
	}

	@Override
	public void printReport() {
		// TODO Auto-generated method stub
		
	}
//	public void searchByName() throws JsonParseException, JsonMappingException, IOException
//	{
//		System.out.println("Enter doctor name to search");
//		//String doctorName=scanner.next();
//		File doctorFile=new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/DoctorDetails.json");
//		List<Doctor> doctorFileList = mapper.readValue(doctorFile, new TypeReference<List<Doctor>>() {});
//		//doctorList.addAll(doctorFileList);
//		
//		for(Doctor doc:doctorFileList)
//		{
//		System.out.println(doc.getDoctorName());
//		if(doc.getDoctorName().equalsIgnoreCase(doctorName))
//		{
//			System.out.println("Doctor is available");
//		}
//		}
//		
//		
//		
//	}
	
	public <T>void writeToJsonFile(List<T> list,File file) throws JsonGenerationException, JsonMappingException, IOException
	{
	ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
	writer.writeValue(file, list);
	System.out.println("Data added Successfully");
	}

}
