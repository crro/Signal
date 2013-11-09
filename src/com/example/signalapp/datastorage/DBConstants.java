package com.example.signalapp.datastorage;


public class DBConstants {

	public static int R_DATABASE_VERSION = 2;
	public static final String R_TABLE_NAME = "received";
	public static final String R_COLUMN_ID = "id";
	public static final String R_COLUMN_MESSAGE = "message";
	public static final String R_COLUMN_SENDER = "sender"; 
	public static final String R_COLUMN_DATE = "date";
	public static final String [] R_ALL_COLUMNS = {"id", "message", "sender", "date"};
	public static final String R_TABLE_CREATE = "create table" + DBConstants.R_TABLE_NAME 
			 + "(" + DBConstants.R_COLUMN_ID + " INTEGER primary key, " 
			 + DBConstants.R_COLUMN_MESSAGE + " TEXT not null, " 
			 + DBConstants.R_COLUMN_SENDER + " STRING not null, " 
			 + DBConstants.R_COLUMN_DATE + " STRING); ";
	public static final String R_DROP_ALL = "DROP TABLE IF EXISTS "+R_TABLE_NAME+";";
	
	public static int S_DATABASE_VERSION = 2;
	public static final String S_TABLE_NAME = "sent";
	public static final String S_COLUMN_ID = "id";
	public static final String S_COLUMN_MESSAGE = "message";
	public static final String S_COLUMN_RECIPIENT = "recipient"; 
	public static final String S_COLUMN_DATE = "date";
	public static final String S_TABLE_CREATE = "create table" + DBConstants.S_TABLE_NAME 
			 + "(" + DBConstants.S_COLUMN_ID + " INTEGER primary key, " 
			 + DBConstants.S_COLUMN_MESSAGE + " TEXT not null, " 
			 + DBConstants.S_COLUMN_RECIPIENT + " STRING not null, " 
			 + DBConstants.S_COLUMN_DATE + " STRING); ";
	public static final String S_DROP_ALL = "DROP TABLE IF EXISTS "+S_TABLE_NAME+";";

	public static int I_DATABASE_VERSION = 2;
	public static final String I_TABLE_NAME = "Information";
	public static final String I_COLUMN_ID = "id";
	public static final String I_PHONE_NO = "phone_number";
	public static final String I_CREATE_TABLE = "create table" + DBConstants.I_TABLE_NAME
			+ "(" + DBConstants.I_COLUMN_ID + " INTEGER primary key, " 
			 + DBConstants.I_PHONE_NO + " TEXT not null); "; 
	public static final String I_DROP_ALL = "DROP TABLE IF EXISTS "+I_TABLE_NAME+";";
	
	
}
