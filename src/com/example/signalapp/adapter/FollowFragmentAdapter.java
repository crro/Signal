package com.example.signalapp.adapter;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.signalapp.SignalConstants;
import com.example.signalapp.fragment.FollowFragment;
import com.example.signalapp.fragment.FollowingFragment;
import com.example.signalapp.fragment.RequestsFragment;


public class FollowFragmentAdapter extends FragmentPagerAdapter {
	
	private ArrayList<Fragment> _fragments;
	
	public FollowFragmentAdapter(FragmentManager fm) {
		super(fm);
		_fragments = new ArrayList<Fragment>();
		_fragments.add(new FollowFragment());
		_fragments.add(new FollowingFragment());
		_fragments.add(new RequestsFragment());
	}

	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return _fragments.get(arg0);
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return _fragments.size();
	}
	public CharSequence getPageTitle(int position) {
		switch (position) {
		case 0:
			return SignalConstants.SIGNAL_FRAGMENT_FOLLOW;
		case 1:
			return SignalConstants.SIGNAL_FRAGMENT_FOLLOWING;
		case 2:
			return SignalConstants.SIGNAL_FRAGMENT_REQUESTS;
		default:
			return "unknown";
		}
	}

}
