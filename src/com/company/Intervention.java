package com.company;
import java.util.Date;

public class Intervention {
    private int IdIntervension;
    private Date DatePrevue;
    private Date DateReelle;
    private String EtatRV;

    public Intervention(int idIntervension, Date datePrevue, Date dateReelle, String etatRV) {
        IdIntervension = idIntervension;
        DatePrevue = datePrevue;
        DateReelle = dateReelle;
        EtatRV = etatRV;
    }

    public int getIdIntervension() {
        return IdIntervension;
    }

    public void setIdIntervension(int idIntervension) {
        IdIntervension = idIntervension;
    }

    public Date getDatePrevue() {
        return DatePrevue;
    }

    public void setDatePrevue(Date datePrevue) {
        DatePrevue = datePrevue;
    }

    public Date getDateReelle() {
        return DateReelle;
    }

    public void setDateReelle(Date dateReelle) {
        DateReelle = dateReelle;
    }

    public String getEtatRV() {
        return EtatRV;
    }

    public void setEtatRV(String etatRV) {
        EtatRV = etatRV;
    }
}
