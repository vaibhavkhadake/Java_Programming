package com.bridgelabzs.OOPConcepts.AddressBookNew;

public class AddressBookNew 
{
	PersonNew person=new PersonNew();
	AddressNew address=new AddressNew();
	public PersonNew getPerson() {
		return person;
	}
	public AddressNew getAddress() {
		return address;
	}
	public void setAddress(AddressNew address) {
		this.address = address;
	}
	public void setPerson(PersonNew person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "AddressBookNew [person=" + person + ", address=" + address + "]";
	}
	
	
	
}
