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

public class MainActivity4 extends AppCompatActivity {
    private EditText Nome;
    private EditText Prenom;
    private EditText Numero;
    private Button btnAjouter;
    private Button btnAfficher;
    private ArrayList<String> listUtilisateur;
    private ArrayAdapter<String> adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Nome = findViewById(R.id.nome);
        Prenom = findViewById(R.id.prenome);
        btnAjouter = findViewById(R.id.btn3);
        btnAfficher = findViewById(R.id.btn4);
        Numero = findViewById(R.id.numiro);
        listUtilisateur = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listUtilisateur);

        btnAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = Nome.getText().toString();
                String prenome = Prenom.getText().toString();
                String numiro = Numero.getText().toString();
                String UtilisateurInfo = "Nom: " + nome + "\n Prenom: " + prenome + "\n Id : " + numiro;
                listUtilisateur.add(UtilisateurInfo);
                adapter.notifyDataSetChanged();
                Nome.setText("");
                Prenom.setText("");
                Numero.setText("");
                Stagier stagier = new Stagier(numiro, nome, prenome);
                Stagier.addform(stagier);
            }
        });
        btnAfficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                intent.putStringArrayListExtra("utilisateurs", listUtilisateur);
                startActivity(intent);
            }
        });
    }
}
