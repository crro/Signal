package com.example.signalapp.fragment;

import com.example.signalapp.R;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class InboxFragment extends ListFragment {
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	
		View view  = inflater.inflate(R.layout.inbox_signal_list, null);
		
		return view;
	}
}
