package net.GestionAlertes;

public abstract class Incident implements Supervisable,Comparable<Incident> {
    private String idIncident;
    protected  String lieu;
    protected NiveauUrgence niveau ;
    protected boolean resolu = false;

    public Incident(String id,String lieu, NiveauUrgence nv){
        idIncident=id;
        this.lieu=lieu;
        niveau=nv;
    }

    public abstract double calculerGravite();
    @Override
    public int compareTo(Incident autre){
        return idIncident.compareTo(autre.idIncident);
    }
    public String getIdIncident(){return idIncident;}
}
