package org.TheCyberAlchemistSystem;

public enum ElementMagique {
    FEU(3.5),
    GLACE(2.0),
    OMBRE(5.0);

    private final double multiplier;
    private ElementMagique(double m){
        multiplier=m;
    }
    public double getMultiplier(){return multiplier;}
}
