package com.example.dashboard1999;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {
    private ListView listView2;
    private ArrayAdapter<String> adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        listView2 = findViewById(R.id.listView2);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        listView2.setAdapter(adapter);

        // Retrieve the list of users from the intent
        if (getIntent().hasExtra("utilisateurs")) {
            ArrayList<Stagier> utilisateurs = Stagier.getlist1();
            adapter.addAll(String.valueOf(utilisateurs));
        }
    }
}
