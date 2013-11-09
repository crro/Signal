package com.example.signalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.example.signalapp.adapter.FollowFragmentAdapter;

public class AboutActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		FollowFragmentAdapter adapter = new FollowFragmentAdapter(getSupportFragmentManager());
		ViewPager pag = (ViewPager) findViewById(R.id.pagerFollow);
		pag.setAdapter(adapter);
		pag.setCurrentItem(1);
		getActionBar().setHomeButtonEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about, menu);
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
		case R.id.menuAbout:
			Intent aboutIntent = new Intent(this, AboutActivity.class);
			startActivity(aboutIntent);
		default:
			return super.onOptionsItemSelected(item);
		}

}
}