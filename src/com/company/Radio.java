package com.company;

import java.util.Date;

public class Radio {
    private int IdRadio;
    private String RemarquesPositives;
    private String RemarquesNegatives;
    private String RemarquesGenerales;
    private Date DateRadio;
    private String CheminImage;

    public Radio(int idRadio, String remarquesPositives, String remarquesNegatives, String remarquesGenerales, Date dateRadio, String cheminImage) {
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

    public Date getDateRadio() {
        return DateRadio;
    }

    public void setDateRadio(Date dateRadio) {
        DateRadio = dateRadio;
    }

    public String getCheminImage() {
        return CheminImage;
    }

    public void setCheminImage(String cheminImage) {
        CheminImage = cheminImage;
    }
}
