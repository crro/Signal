package com.example.signalapp.datastorage;

import android.content.Context;
import android.database.sqlite.*;


//Class opens DB or updates the schema

public class ReceivedOpenHelper extends SQLiteOpenHelper {
	 
	 ReceivedOpenHelper(Context context) {
	     super(context, DBConstants.R_TABLE_NAME, null, DBConstants.R_DATABASE_VERSION);
	 }
	 
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DBConstants.R_TABLE_CREATE);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL(DBConstants.R_DROP_ALL);
        db.execSQL(DBConstants.R_TABLE_CREATE);
	}	
}

