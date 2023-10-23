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

public class MainActivity2 extends AppCompatActivity {
    private EditText Nome;
    private EditText Prenom;
    private EditText Numéro;
    private Button btnAjouter;
    private Button btnAfficher;
    private ArrayList<String> listUtilisateur;
    private ArrayAdapter<String> adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Nome = findViewById(R.id.nom);
        Prenom = findViewById(R.id.prenom);
        Numéro = findViewById(R.id.numero);
        btnAjouter = findViewById(R.id.btn1);
        btnAfficher = findViewById(R.id.btn2);
        listUtilisateur = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listUtilisateur);

        btnAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = Nome.getText().toString();
                String prenom = Prenom.getText().toString();
                String numero = Numéro.getText().toString();
                String UtilisateurInfo = "Nom: " + nome + "\n Prenom: " + prenom + "\n Id : " + numero;
                listUtilisateur.add(UtilisateurInfo);
                adapter.notifyDataSetChanged();
                Nome.setText("");
                Prenom.setText("");
                Numéro.setText("");
                Formateur formateur = new Formateur(numero, nome, prenom );
                Formateur.addform(formateur);
            }
        });
        btnAfficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, com.example.stagierform.MainActivity3.class);
                intent.putStringArrayListExtra("utilisateurs", listUtilisateur);
                startActivity(intent);
            }
        });
    }
}
