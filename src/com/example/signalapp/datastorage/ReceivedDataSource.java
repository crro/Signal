package com.example.signalapp.datastorage;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.*;
import android.database.*;

public class ReceivedDataSource {

	 private Context cxt;  
	 private SQLiteDatabase database;
	 private ReceivedOpenHelper dbHelper;
	 private int counter;
	 
	  public ReceivedDataSource(Context context) {
	    dbHelper = new ReceivedOpenHelper(context);
	    counter = 0;
	  }

	  public void open() throws SQLException {
	    database = dbHelper.getWritableDatabase();
	  }
	  
	  public void close(){ 
			dbHelper.close(); 
	  }
	  
	  public long insertSignal(ReceivedSignalObject sig){
		  ContentValues value = new ContentValues();
		  value.put(DBConstants.R_COLUMN_ID, counter);
		  counter++;
		  value.put(DBConstants.R_COLUMN_MESSAGE, sig.getMessage());
		  value.put(DBConstants.R_COLUMN_SENDER, sig.getSender());
		  value.put(DBConstants.R_COLUMN_DATE, sig.getDate());
		  return database.insert(DBConstants.R_TABLE_NAME, null, value);	  
	  }
	  
	  public boolean deleteAllReceivedSignals() {
			//this eliminates the whole database
		  	int counter = 0;
			return database.delete(DBConstants.R_TABLE_NAME, null, null) > 0;
	  }
	  
	  public ArrayList<ReceivedSignalObject> getAllReceivedSignals(){
		  ArrayList<ReceivedSignalObject> toReturn = new ArrayList<ReceivedSignalObject>();
		  Cursor c = database.query(DBConstants.R_TABLE_NAME, new String[]{
				  										DBConstants.R_COLUMN_ID, 
				  										DBConstants.R_COLUMN_MESSAGE, 
				  										DBConstants.R_COLUMN_SENDER, 
				  										DBConstants.R_COLUMN_DATE}, null, null, null, null, null, null);
		  while(!c.isAfterLast()){
			  ReceivedSignalObject temp = new ReceivedSignalObject(c.getString(1), c.getString(2), c.getString(3));
			  toReturn.add(temp);
			  
		  }		  
		  return toReturn;
	  }

	
}
