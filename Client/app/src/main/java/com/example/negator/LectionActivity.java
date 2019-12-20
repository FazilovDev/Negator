package com.example.negator;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class LectionActivity extends ListActivity {
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] values_lec = new String[] { "StringFromBD1", "StringFromBD2", "StringFromBD3",
                "StringFromBD4", "StringFromBD5", "StringFromBD6", "StringFromBD7", "StringFromBD8",
                "StringFromBD9", "StringFromBD10" };
        // Использование собственного шаблона
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.lectionlayout, R.id.label_lec, values_lec);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent2 = new Intent(LectionActivity.this, EndLectActivity.class);
        startActivity(intent2);
    }
}