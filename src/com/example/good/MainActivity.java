package com.example.good;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity {
	
	private FragmentTabHost tabs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tabs = (FragmentTabHost) findViewById(android.R.id.tabhost);
		tabs.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
		
		 tabs.addTab(tabs.newTabSpec("Tab1").setIndicator("Tab1"),Tab1.class, null);
		 tabs.addTab(tabs.newTabSpec("Tab2").setIndicator("Tab2"),Tab2.class, null);
		 tabs.addTab(tabs.newTabSpec("Tab3").setIndicator("Tab3"),Tab3.class, null);

	}

	
}
