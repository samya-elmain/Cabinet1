package com.company;
import java.util.Date;

public class ActeMedical {
    private int IdSoin;
    private Date DebutSoin;
    private double PrixComptabilise;
    private String EtatActe;
    private Date FinSoin;


    public ActeMedical(int idSoin, Date debutSoin, double prixComptabilise, String etatActe, Date finSoin) {
        IdSoin = idSoin;
        DebutSoin = debutSoin;
        PrixComptabilise = prixComptabilise;
        EtatActe = etatActe;
        FinSoin = finSoin;
    }

    public int getIdSoin() {
        return IdSoin;
    }

    public void setIdSoin(int idSoin) {
        IdSoin = idSoin;
    }

    public Date getDebutSoin() {
        return DebutSoin;
    }

    public void setDebutSoin(Date debutSoin) {
        DebutSoin = debutSoin;
    }

    public double getPrixComptabilise() {
        return PrixComptabilise;
    }

    public void setPrixComptabilise(double prixComptabilise) {
        PrixComptabilise = prixComptabilise;
    }

    public String getEtatActe() {
        return EtatActe;
    }

    public void setEtatActe(String etatActe) {
        EtatActe = etatActe;
    }

    public Date getFinSoin() {
        return FinSoin;
    }

    public void setFinSoin(Date finSoin) {
        FinSoin = finSoin;
    }
}
