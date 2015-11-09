package com.example.ultimatefitnessapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

    public class Register extends Activity {

        EditText name, age, sex, weight, pass, cpass;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);

            name = (EditText) findViewById(R.id.editTextName);
            age = (EditText) findViewById(R.id.editTextAge);
            sex = (EditText) findViewById(R.id.editTextSex);
            weight = (EditText) findViewById(R.id.editTextWeight);
            pass = (EditText) findViewById(R.id.editTextPassword2);
            cpass = (EditText) findViewById(R.id.editTextConfirmPassword);

        }

        public void btnRegister(View view) {
            switch (view.getId()) {
                case R.id.btnRegister:

                    break;
            }

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
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
}
