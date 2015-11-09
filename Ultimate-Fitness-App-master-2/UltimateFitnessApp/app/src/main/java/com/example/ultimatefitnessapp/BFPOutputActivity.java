package com.example.ultimatefitnessapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class BFPOutputActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfpoutput);


        //Get the bundle
        Bundle bundle = getIntent().getExtras();

        //Extract the data…
        String data = bundle.getString("Trans");
        double bfp = Double.parseDouble(data);


        //truncating
        bfp = roundTwoDecimals(bfp);
        data = String.valueOf(bfp);
        String bfpstat = "";
        TextView outbfp = (TextView) findViewById(R.id.tBodyFatPercent);
        TextView outstat = (TextView) findViewById(R.id.tstatbfp);

        if (bfp < 18.5) {
            outbfp.setText(data);
            bfpstat = "UnderWeight";
            outstat.setText(bfpstat);

        } else if (bfp < 24.9) {
            outbfp.setText(data);
            bfpstat = "Healthy";
            outstat.setText(bfpstat);
        } else if (bfp < 29.9) {
            outbfp.setText(data);
            bfpstat = "OverWeight";
            outstat.setText(bfpstat);
        } else {
            outbfp.setText(data);
            bfpstat = "Obese";
            outstat.setText(bfpstat);
        }

        Button bfpWeb = (Button) findViewById(R.id.BFPbutton);
        bfpWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("http://www.builtlean.com/2010/08/03/ideal-body-fat-percentage-chart/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }

            });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bfpoutput, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public double roundTwoDecimals(double d) {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(d));
    }

}
