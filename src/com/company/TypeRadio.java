package com.company;

public class TypeRadio {
    private int IdTypeRadio;
    private String description;

    public TypeRadio(int idTypeRadio, String Description) {
        IdTypeRadio = idTypeRadio;
        description = Description;

    }

    public int getIdTypeRadio() {
        return IdTypeRadio;
    }

    public void setIdTypeRadio(int idTypeRadio) {
        IdTypeRadio = idTypeRadio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

