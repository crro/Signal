package com.example.signalapp.datastorage;


import android.content.Context;
import android.database.sqlite.*;

public class InfoOpenHelper extends SQLiteOpenHelper {
	
	public InfoOpenHelper(Context context) {
	     super(context, DBConstants.I_TABLE_NAME, null, DBConstants.I_DATABASE_VERSION);
	 }
	

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DBConstants.I_CREATE_TABLE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL(DBConstants.I_DROP_ALL);
	    db.execSQL(DBConstants.I_CREATE_TABLE);
		
	}

}
