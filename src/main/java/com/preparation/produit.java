package com.preparation;

public abstract class  produit implements vendable, Comparable<produit> {
    protected double prix;
    protected int quantite;
    protected String nom;

    public produit (String n,double p,int q) throws produitexception{
      if(n==null || n.isEmpty()){throw new produitexception("NOM VIDE");}
      if(p<0){throw new produitexception("prix negatif"+p);}
      if(q<0){throw new produitexception("quantite negatif"+q);}
        prix=p;
        nom=n;
        quantite=q;
    }
    public String getNom(){return nom ;}
    public double getPrix(){
        return prix;
    }
    public int getQuantite(){ return quantite;}


    @Override
    public double prixFinal(){return prix;}
    public String toString(){ return nom + ":"+prixFinal()+"DH";}
    public abstract double prixtotal();
    @Override
    public String getType() {
        return "produit";
    }
    @Override
    public boolean isEnStock(){
        return quantite>0;
    }

    @Override
    public int compareTo(produit p){
        return Double.compare(this.prix,p.prix);
    }
}
