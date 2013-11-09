package com.example.signalapp.datastorage;

public class SentSignalObject {
	
	private String message, recipient, date;
	
	public SentSignalObject(String m, String r, String d){
		message = m;
		recipient = r;
		date = d;
	}
	
	public String getMessage(){
		return message;
	}
	
	public String getRecipient(){
		return recipient;
	}
	
	public String getDate(){
		return date;
	}
	
	

}
