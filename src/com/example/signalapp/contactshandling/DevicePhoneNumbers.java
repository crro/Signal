package com.example.signalapp.contactshandling;

import java.util.*;


import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;

public class DevicePhoneNumbers {

	public static ArrayList<ContactObject> getContacts(Context cxt){
		
		ArrayList<ContactObject> toReturn = new ArrayList<ContactObject>();
		Cursor cursor = cxt.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI,null,null, null,null);
		String name = null, id = null, number = null;
		while (cursor.moveToNext()) {
			name = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
			id = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.LOOKUP_KEY));
		    if (Integer.parseInt(cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER))) > 0) {                
		        Cursor pCur = cxt.getContentResolver().query(
		        ContactsContract.CommonDataKinds.Phone.CONTENT_URI, 
		        null,
		        ContactsContract.CommonDataKinds.Phone.CONTACT_ID +" = "+cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.LOOKUP_KEY)),
		        null, 
		        null);
		        if (pCur.moveToNext()) {
		            number = pCur.getString(pCur.getColumnIndex("DATA1"));
		        } 
		        pCur.close();
		    } 
		} 
		
		if ((name != null) && (id != null) && (number != null)){
			toReturn.add(new ContactObject(name, id, number));
		}
		return toReturn; 
	}
	
	
}
