package com.company;
public class CouvertureMedicale {
    private int IdCouverture;
    private String TypeCouverture;

    public CouvertureMedicale(int idCouverture, String typeCouverture) {
        IdCouverture = idCouverture;
        TypeCouverture = typeCouverture;
    }

    public int getIdCouverture() {
        return IdCouverture;
    }

    public void setIdCouverture(int idCouverture) {
        IdCouverture = idCouverture;
    }

    public String getTypeCouverture() {
        return TypeCouverture;
    }

    public void setTypeCouverture(String typeCouverture) {
        TypeCouverture = typeCouverture;
    }
}
