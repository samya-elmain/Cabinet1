package com.company;

import java.io.Serializable;
import java.util.Date;

public class Radio implements Serializable {
    private int IdRadio;
    private String RemarquesPositives;
    private String RemarquesNegatives;
    private String RemarquesGenerales;
    private int DateRadio;
    private String CheminImage;

    public Radio(int idRadio, String remarquesPositives, String remarquesNegatives, String remarquesGenerales, int dateRadio, String cheminImage) {
        IdRadio = idRadio;
        RemarquesPositives = remarquesPositives;
        RemarquesNegatives = remarquesNegatives;
        RemarquesGenerales = remarquesGenerales;
        DateRadio = dateRadio;
        CheminImage = cheminImage;
    }

    public int getIdRadio() {
        return IdRadio;
    }

    public void setIdRadio(int idRadio) {
        IdRadio = idRadio;
    }

    public String getRemarquesPositives() {
        return RemarquesPositives;
    }

    public void setRemarquesPositives(String remarquesPositives) {
        RemarquesPositives = remarquesPositives;
    }

    public String getRemarquesNegatives() {
        return RemarquesNegatives;
    }

    public void setRemarquesNegatives(String remarquesNegatives) {
        RemarquesNegatives = remarquesNegatives;
    }

    public String getRemarquesGenerales() {
        return RemarquesGenerales;
    }

    public void setRemarquesGenerales(String remarquesGenerales) {
        RemarquesGenerales = remarquesGenerales;
    }

    public int getDateRadio() {
        return DateRadio;
    }

    public void setDateRadio(int dateRadio) {
        DateRadio = dateRadio;
    }

    public String getCheminImage() {
        return CheminImage;
    }

    public void setCheminImage(String cheminImage) {
        CheminImage = cheminImage;
    }
    public String toString(){
        return IdRadio+" "+RemarquesPositives+" "+RemarquesNegatives+" "+RemarquesGenerales+" "+DateRadio+" "+CheminImage;
    }
}
