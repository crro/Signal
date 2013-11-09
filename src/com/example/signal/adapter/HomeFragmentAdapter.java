package com.example.signal.adapter;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class HomeFragmentAdapter extends FragmentPagerAdapter {
	
	private ArrayList<Fragment> _fragments;
	
	public HomeFragmentAdapter(FragmentManager fm) {
		super(fm);
		_fragments = new ArrayList<Fragment>();
	}

	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
