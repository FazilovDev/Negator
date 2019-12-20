package com.example.negator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onLecture(View view) {
        Intent intent2 = new Intent(MenuActivity.this, VisitorsActivity.class);
        startActivity(intent2);
    }

    public void onAddLecture(View view) {
        Intent intent2 = new Intent(MenuActivity.this,LectionActivity.class);
        startActivity(intent2);
    }

}