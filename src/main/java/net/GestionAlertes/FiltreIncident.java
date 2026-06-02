package net.GestionAlertes;

@FunctionalInterface
public interface FiltreIncident {
    boolean analyser(Incident inc);
}
