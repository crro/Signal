package com.example.signalapp.datastorage;

import java.util.ArrayList;

public class TempMethods {
	
	public void sendSignal (SentSignalObject sig, SentDataSource sds){
		sds.insertSignal(sig);	
	}
	
	public void deleteAllSent(SentDataSource sds){
		sds.deleteAllSentSignals();
	}
	
	public void deleteAllReceived(ReceivedSignalObject sig, ReceivedDataSource rds){
		rds.deleteAllReceivedSignals();
	}
	
	public ArrayList<SentSignalObject> getOutputbox(SentDataSource sds){
		return sds.getAllSentSignals();
	}
	
	public ArrayList<ReceivedSignalObject> getInputBox(ReceivedDataSource rds){
		return rds.getAllReceivedSignals();
	}

}
