package com.example.ultimatefitnessapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BFPActivitymen extends Activity {
	EditText Weight,Height,NeckCircumference,WaistCircumference;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bfp_men);


		Weight = (EditText) findViewById(R.id.eWeight);
		//Height = (EditText) findViewById(R.id.eHeight);
		//NeckCircumference = (EditText) findViewById(R.id.eNeckCircumference);
		WaistCircumference = (EditText) findViewById(R.id.eWaistCircumference);


		Button calc = (Button) findViewById(R.id.calculatebfp);
		calc.setOnClickListener(new View.OnClickListener() {

			@Override
			//this will have all the things that the button Compute will do on click
			public void onClick(View v) {
				Log.v("qqq", "gjh");
				double weight = Double.parseDouble(Weight.getText().toString());
				//double height = Double.parseDouble(Height.getText().toString());
				//double neckCircumference = Double.parseDouble(NeckCircumference.getText().toString());
				double waistCircumference = Double.parseDouble(WaistCircumference.getText().toString());

            /*
				Body Fat Formula For Men
				Factor 1	(Total body weight x 1.082) + 94.42
				Factor 2	Waist measurement x 4.15
				Lean Body Mass	Factor 1 - Factor 2
				Body Fat Weight	Total bodyweight - Lean Body Mass
				Body Fat Percentage	(Body Fat Weight x 100) / total bodyweight */


				double factor1= (weight*1.082)+94.42;
				double factor2= (waistCircumference)*4.15;
				double leanbodymass=factor1-factor2;
				double bodyfatweight=weight-leanbodymass;
				double bodyfatpercentage=(bodyfatweight*100)/weight;

				Toast.makeText(BFPActivitymen.this, "Body Fat Percentage : " + bodyfatpercentage + "%", Toast.LENGTH_SHORT).show();

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bf, menu);
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
