package com.example.somkiat.workingwithintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        resultTextView = (TextView) findViewById(R.id.result);


        Intent resultIntent = getIntent();
        resultTextView.setText(resultIntent.getStringExtra("result"));
    }
}
