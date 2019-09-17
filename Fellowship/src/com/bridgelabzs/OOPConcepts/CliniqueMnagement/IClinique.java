package com.bridgelabzs.OOPConcepts.CliniqueMnagement;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface IClinique 
{

	void addDoctor() throws JsonGenerationException, JsonMappingException, IOException;
	void addPatients() throws JsonParseException, JsonMappingException, IOException;
	void printReport();
	
}
