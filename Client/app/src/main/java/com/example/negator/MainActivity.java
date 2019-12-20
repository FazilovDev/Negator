package com.example.negator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText userName = (EditText) findViewById(R.id.lname);
        EditText userPass = (EditText) findViewById(R.id.lpass);


    }

    public void onEnter(View v) {
        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void onRegist(View v) {
        Intent intent1 = new Intent(MainActivity.this, RegistrationActivity.class);
        startActivity(intent1);
    }
}
