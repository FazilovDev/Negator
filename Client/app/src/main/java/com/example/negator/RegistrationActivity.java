package com.example.negator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void goToActivity(View view) {
        Intent intent2 = new Intent(RegistrationActivity.this, MenuActivity.class);
        startActivity(intent2);
    }

}

