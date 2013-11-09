package com.example.signalapp.contactshandling;

public class ContactObject {
	
	private String name, id, number;
	
	public ContactObject(String n1, String i, String n2){
		name = n1;
		id = i;
		number = n2;
	}
	
	public String getName(){
		return name;
	}
	
	public String getID(){
		return id;
	}
	
	public String getNumber(){
		return number;
	}

}
