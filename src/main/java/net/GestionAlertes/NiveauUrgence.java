package net.GestionAlertes;

public enum NiveauUrgence {
    FAIBLE(1.0),
    MOYEN(2.5),
    CRITIQUE(5.0);
    private double multiplicateur;
    private NiveauUrgence(double mul){
        multiplicateur=mul;
    }
    public double getMultiplicateur(){return multiplicateur;}
}
