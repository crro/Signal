package com.example.signalapp.adapter;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.signalapp.fragment.InboxFragment;
import com.example.signalapp.fragment.SentSignalsFragment;
import com.example.signalapp.fragment.WriteSignalFragment;
import com.example.signalapp.SignalConstants;


public class HomeFragmentAdapter extends FragmentPagerAdapter {
	
	private ArrayList<Fragment> _fragments;
	
	public HomeFragmentAdapter(FragmentManager fm) {
		super(fm);
		_fragments = new ArrayList<Fragment>();
		_fragments.add(new InboxFragment());
		_fragments.add(new SentSignalsFragment());
		_fragments.add(new WriteSignalFragment());
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
			return SignalConstants.SIGNAL_FRAGMENT_WRITE;
		case 1:
			return SignalConstants.SIGNAL_FRAGMENT_INBOX;
		case 2:
			return SignalConstants.SIGNAL_FRAGMENT_SENT;
		default:
			return "unknown";
		}
	}

}
