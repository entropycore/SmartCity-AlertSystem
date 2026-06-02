package com.preparation;

public class produitSolde extends produit{
    private double remise;
    public produitSolde(String n,double p,int q, double r) throws produitexception{
        super(n,p,q);
        remise =r;
    }

    public double getRemise() {
        return remise;
    }

    @Override
    public double prixFinal(){return prix*(1-remise);}

    @Override
    public String toString(){
        return super.toString() + "(solde" + remise*100 +"%)";
    }

    @Override
    public double prixtotal(){return quantite*prixFinal();}

}
