package com.example.ultimatefitnessapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BFPActivitywomen extends Activity {
    EditText Weight,WristCircumference,WaistCircumference,HipCircumference,ForearmCircumference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfp_women);


        Weight = (EditText) findViewById(R.id.eWeight);
        WristCircumference = (EditText) findViewById(R.id.eWristCircumference);
        WaistCircumference = (EditText) findViewById(R.id.eWaistCircumference);
        HipCircumference = (EditText) findViewById(R.id.eHipCircumference);
        ForearmCircumference = (EditText) findViewById(R.id.eForearmCircumference);


        Button calc = (Button) findViewById(R.id.calculatebfp);
        calc.setOnClickListener(new View.OnClickListener() {

            @Override
            //this will have all the things that the button Compute will do on click
            public void onClick(View v) {
                Log.v("qqq", "gjh");
                double weight = Double.parseDouble(Weight.getText().toString());
                double wristmeasurement = Double.parseDouble(WristCircumference.getText().toString());
                double waistmeasurement = Double.parseDouble(WaistCircumference.getText().toString());
                double hipmeasurement = Double.parseDouble(HipCircumference.getText().toString());
                double forearmmeasurement = Double.parseDouble(ForearmCircumference.getText().toString());

           /*
           Body Fat Formula For Women
          Factor 1	(Total body weight x 0.732) + 8.987
          Factor 2	Wrist measurement (at fullest point) / 3.140
          Factor 3	Waist measurement (at naval) x 0.157
          Factor 4	Hip measurement (at fullest point) x 0.249
          Factor 5	Forearm measurement (at fullest point) x 0.434
          Lean Body Mass	Factor 1 + Factor 2 - Factor 3 - Factor 4 + Factor 5
          Body Fat Weight	Total bodyweight - Lean Body Mass
          Body Fat Percentage	(Body Fat Weight x 100) / total bodyweight
            */
                Log.v("qqq", "gjh");
                if(Weight.getText().toString()!=null && Weight.getText().toString().isEmpty()
                        && WristCircumference.getText().toString()!=null && WristCircumference.getText().toString().isEmpty()
                        && WaistCircumference.getText().toString()!=null && WaistCircumference.getText().toString().isEmpty()
                        && HipCircumference.getText().toString()!=null && HipCircumference.getText().toString().isEmpty()
                        && ForearmCircumference.getText().toString()!=null && ForearmCircumference.getText().toString().isEmpty()) {
                    Log.v("qqq", "gjh");

                    Toast.makeText(BFPActivitywomen.this, "Please enter the Values", Toast.LENGTH_SHORT).show();
                    Log.v("qqq", "gjh");
                }else {
                    Log.v("qqq", "gjh");
                    double factor1 = (weight * 0.782) + 8.987;
                    double factor2 = (wristmeasurement) / 3.140;
                    double factor3 = (waistmeasurement) * 0.157;
                    double factor4 = (hipmeasurement) * 0.249;
                    double factor5 = (forearmmeasurement) * 0.434;
                    double leanbodymass = factor1 + factor2 - factor3 - factor4 + factor5;
                    double bodyfatweight = weight - leanbodymass;
                    double bodyfatpercentage = (bodyfatweight * 100) / weight;
                    Log.v("qqq", "gjh");


                    String Outputbodyfatpercentage = String.valueOf(bodyfatpercentage);

                    //Create the bundle
                    Bundle bundle = new Bundle();

                    //Add your data to bundle
                    bundle.putString("Trans", Outputbodyfatpercentage);


                    Intent intent = new Intent(BFPActivitywomen.this, BFPOutputActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);


                  //  Toast.makeText(BFPActivitywomen.this, "Body Fat Percentage : " + bodyfatpercentage + "%", Toast.LENGTH_SHORT).show();
                }

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
