package com.company;

import java.io.Serializable;
import java.util.Date;

public class Patient implements Serializable {
    private int IDPatient;
    private int DateNaissance;
    private String CIN;
    private String nom;
    private String prenom;
    private String sexe;

    public Patient(int IDPatient, int DateNaissance, String CIN, String nom, String prenom, String sexe) {
        this.IDPatient = IDPatient;
        this.DateNaissance = DateNaissance;
        this.CIN = CIN;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
    }

    public int getIDPatient() {
        return IDPatient;
    }

    public void setIDPatient(int IDPatient) {
        this.IDPatient = IDPatient;
    }

    public int getDateNaissance() {
        return DateNaissance;
    }

    public void setDateNaissance(int dateNaissance) {
        DateNaissance = dateNaissance;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String toString(){
        return IDPatient+" "+DateNaissance+" "+CIN+" "+nom+" "+prenom+" "+sexe;
    }
}

