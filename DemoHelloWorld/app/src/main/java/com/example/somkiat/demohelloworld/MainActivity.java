package com.example.somkiat.demohelloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = (EditText) findViewById(R.id.name_text);
    }

    public void goToWelcomePage(View view) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtra("name", nameText.getText().toString());
        startActivity(intent);
    }
}
