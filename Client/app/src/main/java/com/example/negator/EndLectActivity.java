package com.example.negator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

    public class EndLectActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_end_lect);
        }

        public void onDelect (View view) {
            Intent intent3 = new Intent(EndLectActivity.this, MenuActivity.class);
            startActivity(intent3);
        }

    }

