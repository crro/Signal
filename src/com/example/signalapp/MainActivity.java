package com.example.signalapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.widget.RatingBar;
import com.example.signalapp.R;


import com.example.signalapp.adapter.HomeFragmentAdapter;

public class MainActivity extends FragmentActivity {

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

		MenuItem menuItem = menu.findItem(R.id.menu_search);
		final RatingBar ratingBar = (RatingBar) menuItem.getActionView();
		ratingBar.setMax(5);
		ratingBar.setProgress(3);

		menuItem.setOnActionExpandListener(new OnActionExpandListener() {
			@Override
			public boolean onMenuItemActionCollapse(MenuItem item) {
				tvStatus.append("Rating: " + ratingBar.getProgress() + "\n");
				return true; // Return true to collapse action view
			}

			@Override
			public boolean onMenuItemActionExpand(MenuItem item) {
				tvStatus.append("Expanded\n");
				return true; // Return true to expand action view
			}
		});

		return true;
	}
}
