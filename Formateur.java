package com.example.dashboard1999;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Formateur {

    protected String id;
    protected String nom;
    protected String prenom;
    public Formateur(String id, String nom, String prenom){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    @NonNull
    @Override
    public String toString() {
        return " ID :" + getId() +
                "\n Nom :" + getNom() +
                "\n Prenom :" + getPrenom();
    }
    private static ArrayList<Formateur> list = new ArrayList<>();

    public static void addform(Formateur F){
        list.add(F);
    }
    public static ArrayList<Formateur> getlist(){
        return list;
    }
}

