package com.example.ultimatefitnessapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		Thread timer = new Thread(){
			public void run()
			{
				try{
					sleep(5000);
				}
				catch(Exception E)
				{
					E.printStackTrace();
				} finally {
					Intent intent = new Intent("com.example.ultimatefitnessapp.OptionActivity");
					startActivity(intent);
					
				}
			}
			};
		timer.start();	
		}
		

		@Override
		protected void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
			finish();
		}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
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