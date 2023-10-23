package com.example.dashboard1999;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SeanceActivity extends AppCompatActivity {
    private EditText leur;
    private EditText dateDeSalle;
    private Button ajouterLeur;
    private Button afficherLeur;
    private ArrayList<String> listUtilisateur;
    private ArrayAdapter<String> adapter;

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seance);
        leur = findViewById(R.id.leur);
        dateDeSalle = findViewById(R.id.datedesalle);
        ajouterLeur = findViewById(R.id.leurAj);
        afficherLeur = findViewById(R.id.leurAf);
        listUtilisateur = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listUtilisateur);

        ajouterLeur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String leurText = leur.getText().toString();
                String numDeSalle = dateDeSalle.getText().toString();
                String utilisateurInfo = "Leur: " + leurText + "\n Num De Salle: " + numDeSalle;
                listUtilisateur.add(utilisateurInfo);
                adapter.notifyDataSetChanged();
                leur.setText("");
                dateDeSalle.setText("");
                Seance seance = new Seance(leurText, numDeSalle);
                Seance.addform(seance);
            }
        });

        afficherLeur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeanceActivity.this, listleur.class);
                intent.putStringArrayListExtra("utilisateurs", listUtilisateur);
                startActivity(intent);
            }
        });
    }
}
