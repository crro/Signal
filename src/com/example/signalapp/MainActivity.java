package com.example.signalapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

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
	}

}
