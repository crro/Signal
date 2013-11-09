package com.example.signalapp.datastorage;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class InfoSource {

	 private Context cxt;  
	 private SQLiteDatabase database;
	 private InfoOpenHelper dbHelper;
	 private int counter;
	 
	 public InfoSource(Context context){
		 dbHelper = new InfoOpenHelper(context);
		 counter = 0;
	 }
	 
	 public void open() throws SQLException {
		 database = dbHelper.getWritableDatabase();
	 }
		  
	 public void close(){ 
		 dbHelper.close(); 
	 }
	 
	 public long insertInfo(String number){
		  ContentValues value = new ContentValues();
		  value.put(DBConstants.I_COLUMN_ID, counter);
		  counter++;
		  value.put(DBConstants.I_PHONE_NO, number);
		  return database.insert(DBConstants.R_TABLE_NAME, null, value);	  
	 }
	 
	 public boolean deleteInfo() {
			//this eliminates the whole database
		  	int counter = 0;
			return database.delete(DBConstants.I_TABLE_NAME, null, null) > 0;
	 }
	 
	 
	 public String getThisPhoneNumber(){
		 String toReturn = "";
		 Cursor c = database.query(DBConstants.I_TABLE_NAME, new String[]{
				  									DBConstants.I_COLUMN_ID, 
				  									DBConstants.I_PHONE_NO},
				  									null, null, null, null, null, null);
		 if(!c.isAfterLast()){
			  
			  return c.getString(1);
			  
		  }
		  
		  return toReturn;
	  }
	
}
