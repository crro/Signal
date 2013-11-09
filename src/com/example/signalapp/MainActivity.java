package com.example.signalapp;

import android.app.ActionBar;
import android.app.ActionBar.OnNavigationListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.signalapp.adapter.HomeFragmentAdapter;

public class MainActivity extends FragmentActivity implements OnNavigationListener{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		HomeFragmentAdapter adapter = new HomeFragmentAdapter(getSupportFragmentManager());
		ViewPager pag = (ViewPager) findViewById(R.id.pager);
		pag.setAdapter(adapter);
		pag.setCurrentItem(1);
		
		
		getActionBar().setHomeButtonEnabled(true);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);

		//MenuItem menuItem = menu.findItem(R.id.menu_search);
		

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

	public boolean onNavigationItemSelected(int itemPosition, long itemId) {
		return false;
	}
}
