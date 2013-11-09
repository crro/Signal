package com.example.signalapp.application;

import com.example.signalapp.datastorage.InfoSource;
import com.example.signalapp.datastorage.ReceivedDataSource;
import com.example.signalapp.datastorage.SentDataSource;

import android.app.Application;

public class SignalApplication extends Application {
	
	private static ReceivedDataSource rds;
	private static SentDataSource sds;
	private static InfoSource is;
	
	@Override
	public void onCreate(){
		rds = new ReceivedDataSource(this);
		rds.open();
		sds = new SentDataSource(this);
		sds.open();
		is = new InfoSource(this);
		is.open();		
	}
	
	public static ReceivedDataSource getReceivedDataSoure(){
		return rds;
	}
	
	public static SentDataSource getSentDataSource(){
		return sds;
	}
	
	public static InfoSource getInfoSource(){
		return is;
	}
	
	@Override
	public void onTerminate() { 
		rds.close(); 
		sds.close();
		is.close();
		super.onTerminate();
	}
	
	

}
