package com.example.good;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class Unidades extends Activity {
	ListView grid;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.unidades);

		grid =  (ListView) findViewById(R.id.grid);
		grid.setAdapter(new GridAdacter(this));
	}
}