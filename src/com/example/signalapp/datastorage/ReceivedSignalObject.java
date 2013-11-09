package com.example.signalapp.datastorage;

public class ReceivedSignalObject {
	
	private String message, sender, date;
	
	public ReceivedSignalObject(String m, String s, String d){
		message = m;
		sender = s;
		date = d;
	}
	
	public String getMessage(){
		return message;
	}
	
	public String getSender(){
		return sender;
	}
	
	public String getDate(){
		return date; 
	}

}
