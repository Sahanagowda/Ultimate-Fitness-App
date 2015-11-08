package com.example.ultimatefitnessapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class OptionActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_option);

		Button bBMI = (Button) findViewById(R.id.bBMI);
		bBMI.setOnClickListener(new View.OnClickListener() {

			@Override
			//this will have all the things that the button Compute will do on click
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//go to aws option page

				Intent intent = new Intent(OptionActivity.this, BMIFormActivity.class);
				startActivity(intent);
			}
		});

		Button bFP = (Button) findViewById(R.id.bBodyFat);
		Log.v("qqq", "gjh");
		bFP.setOnClickListener(new View.OnClickListener() {

			@Override
			//this will have all the things that the button Compute will do on click
			public void onClick(View v) {
				Log.v("qqq", "gjh");
				// TODO Auto-generated method stub
				//go to aws option page
				Log.v("qqq", "gjh");
				Intent intent = new Intent(OptionActivity.this, BFPActivity.class);
				startActivity(intent);
			}
		});
	}


		/*	@Override
			//this will have all the things that the button Compute will do on click
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//go to aws option page

			Button bBMI = (Button) findViewById(R.id.bBMI);
			bBMI.setOnClickListener(new View.OnClickListener(){

				@Override
				//this will have all the things that the button Compute will do on click
				public void onClick(View v) {
					// TODO Auto-generated method stub
					//go to aws option page

					Intent intent= new Intent(OptionActivity.this,BFPActivitymen.class);
				    startActivity(intent);
			};*/




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.option, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
