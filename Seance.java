package com.example.dashboard1999;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Seance {
    protected String leur;
    protected String numdesalle;
    public Seance(String leur, String numdesalle){
        this.leur = leur;
        this.numdesalle = numdesalle;
    }
    public String getLeur() {
        return leur;
    }
    public void setLeur(String leur) {
        this.leur = leur;
    }

    public String getNumdesalle() {
        return numdesalle;
    }

    public void setNumdesalle(String numdesalle) {
        this.numdesalle = numdesalle;
    }

    public String toString() {
        return " ID :" + getLeur() +
                "\n Nom :" + getNumdesalle() ;
    }
    private static ArrayList<Seance> lt = new ArrayList<>();

    public static void addform(Seance S){
        lt.add(S);
    }
    public static ArrayList<Seance> getlist3(){
        return lt;
    }
}
