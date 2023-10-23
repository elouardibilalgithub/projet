package com.example.dashboard1999;
import androidx.annotation.NonNull;
import java.util.ArrayList;

public class Stagier {
    protected String numero;
   protected String nom;
   protected String prenom;

    public Stagier(String numero, String nom, String prenom) {
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
    }

    public static void addform(Stagier ignoredStagier) {

    }

    public String getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @NonNull
    @Override
    public String toString() {
        return "Numero: " + getNumero() +
                "\nNom: " + getNom() +
                "\nPrenom: " + getPrenom();
    }

    public static ArrayList<Stagier> getlist1() {
        return null;
    }
}
