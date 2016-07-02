package com.example.somkiat.workingwithintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView yourNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yourNameTextView = (TextView) findViewById(R.id.yourName);
    }

    public void nextPage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("result", yourNameTextView.getText().toString());
        startActivity(intent);
    }
}
