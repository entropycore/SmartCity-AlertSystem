package com.preparation;

public interface vendable {
    String getType();
    double prixFinal();
    boolean isEnStock();
    default String afficher(){
        return getType() + ":" + prixFinal() + "DH";
    }
}
