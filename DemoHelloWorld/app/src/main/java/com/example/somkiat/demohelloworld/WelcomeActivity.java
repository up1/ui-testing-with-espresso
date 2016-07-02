package com.example.somkiat.demohelloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private TextView welcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent intent = getIntent();
        String result = intent.getStringExtra("name");
        welcomeTextView = (TextView) findViewById(R.id.welcome_message);
        welcomeTextView.setText(result);
    }

    public void onShow(View view) {
        welcomeTextView.setText("Hello Espresso");
    }
}
