package org.TheCyberAlchemistSystem;

public abstract class ArtefactMagique implements Invocable,Comparable<ArtefactMagique>{
    private String idArtefact;
    private String nom;
    protected ElementMagique element;
    protected boolean protege =false;

    public ArtefactMagique(String id,String n,ElementMagique el ){
        idArtefact=id;
        nom=n;
        element=el;
    }
    public abstract double calculerPuissance();

    @Override
    public int compareTo(ArtefactMagique autre){
        return nom.compareTo(autre.nom);
    }
    public String getNom(){return nom;}
    public String getIdArtefact(){return idArtefact;}

}
