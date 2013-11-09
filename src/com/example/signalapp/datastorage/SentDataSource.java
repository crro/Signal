package com.example.signalapp.datastorage;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class SentDataSource {

	 private Context cxt;  
	 private SQLiteDatabase database;
	 private SentOpenHelper dbHelper;
	 private int counter;
	 
	 public SentDataSource(Context context){
		 dbHelper = new SentOpenHelper(context);
		 counter = 0;
	 }
	 
	 public void open() throws SQLException {
		 database = dbHelper.getWritableDatabase();
	 }
		  
	 public void close(){ 
		dbHelper.close(); 
	 }
	 
	 public long insertSignal(SentSignalObject sig){
		 ContentValues value = new ContentValues();
		 value.put(DBConstants.S_COLUMN_ID, counter);
		 counter++;
		 value.put(DBConstants.S_COLUMN_MESSAGE, sig.getMessage());
		 value.put(DBConstants.S_COLUMN_RECIPIENT, sig.getRecipient());
		 value.put(DBConstants.S_COLUMN_DATE, sig.getDate());
		 return database.insert(DBConstants.S_TABLE_NAME, null, value);
	 }
	 
	 public boolean deleteAllSentSignals() {
			//this eliminates the whole database
		  	int counter = 0;
			return database.delete(DBConstants.S_TABLE_NAME, null, null) > 0;
	  }
	 
	 public ArrayList<SentSignalObject> getAllSentSignals(){
		  ArrayList<SentSignalObject> toReturn = new ArrayList<SentSignalObject>();
		  Cursor c = database.query(DBConstants.S_TABLE_NAME, new String[]{
				  										DBConstants.S_COLUMN_ID, 
				  										DBConstants.S_COLUMN_MESSAGE, 
				  										DBConstants.S_COLUMN_RECIPIENT, 
				  										DBConstants.S_COLUMN_DATE}, null, null, null, null, null, null);
		  while(!c.isAfterLast()){
			  SentSignalObject temp = new SentSignalObject(c.getString(1), c.getString(2), c.getString(3));
			  toReturn.add(temp);
			  
		  }		  
		  return toReturn;
	  }

	
}
