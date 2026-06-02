package net.GestionAlertes;

public interface Supervisable {
    String genererRapport();
    default void marquerVu(){
        System.out.println("l alerte a ete prise en compte par le systeme");
    }
}
