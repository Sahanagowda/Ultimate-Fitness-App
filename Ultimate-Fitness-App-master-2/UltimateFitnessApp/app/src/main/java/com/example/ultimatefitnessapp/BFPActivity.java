package com.example.ultimatefitnessapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class BFPActivity extends Activity {

    private RadioButton radiomale;
    private RadioButton radiofemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfp);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {

            case R.id.radioButtonmale:
                if (checked) {
                    Intent intent = new Intent(BFPActivity.this, BFPActivitymen.class);
                    startActivity(intent);
                }
                break;
            case R.id.radioButtonfemale:
                if (checked) {
                    Intent intent = new Intent(BFPActivity.this, BFPActivitywomen.class);
                    startActivity(intent);
                }
                break;
        }

    }
}




