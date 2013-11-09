package com.example.signalapp;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class HelpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);
		final ListView listview = (ListView) findViewById(R.id.contactList);
		List<String> values = new ArrayList<String>();
		getActionBar().setHomeButtonEnabled(true);
		//final ListAdapter adapter = new SimpleAdapter(this,values,android.R.layout.simple_list_item_1, new String[] {"Name"},new int[] {});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			Intent intent = new Intent(this, MainActivity.class);
			intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent);
			return true;
		//case R.id.view1:
			//Intent i = new Intent(this, SecActivity.class);
			//startActivity(i);
			//return true;
	
		case R.id.menuHelp:
			Intent helpIntent = new Intent(this, HelpActivity.class);
			startActivity(helpIntent);
		default:
			return super.onOptionsItemSelected(item);
		}

}
}
