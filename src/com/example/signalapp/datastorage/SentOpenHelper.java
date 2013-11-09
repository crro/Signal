package com.example.signalapp.datastorage;

import android.content.Context;
import android.database.sqlite.*;

public class SentOpenHelper extends SQLiteOpenHelper {

	public SentOpenHelper(Context context) {
	     super(context, DBConstants.S_TABLE_NAME, null, DBConstants.S_DATABASE_VERSION);
	 }
	 
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DBConstants.S_TABLE_CREATE);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL(DBConstants.S_DROP_ALL);
       db.execSQL(DBConstants.S_TABLE_CREATE);
	}	
	
}
