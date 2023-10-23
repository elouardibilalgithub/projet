package com.example.dashboard1999;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class listleur extends AppCompatActivity {
    private ListView listView3;
    private ArrayAdapter<String> adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listleur);

        listView3 = findViewById(R.id.listView3);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        listView3.setAdapter(adapter);

        // Retrieve the list of users from the intent
        if (getIntent().hasExtra("utilisateurs")) {
            ArrayList<Seance> utilisateurs = Seance.getlist3();
            adapter.addAll(String.valueOf(utilisateurs));
        }
    }
}