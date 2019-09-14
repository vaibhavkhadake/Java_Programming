package com.bridgelabzs.OOPConcepts.AddressBookNew;

public class AddressBookNew 
{
	PersonNew person;
	
	public PersonNew getPerson() {
		return person;
	}
	public void setPerson(PersonNew person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "AddressBookNew [person=" + person + "]";
	}
	
	
}
