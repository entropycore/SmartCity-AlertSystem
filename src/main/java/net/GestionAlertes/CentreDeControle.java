package net.GestionAlertes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CentreDeControle
{
    private List<Incident> urgence=new ArrayList<>();
    public CentreDeControle(){}

    public void declarerIncident(Incident inc){
        urgence.add(inc);
    }

    public void trierParId(){
        Collections.sort(urgence);
    }

    public void trierParGraviteUrgent(){
        urgence.sort((a,b)->Double.compare(b.calculerGravite(),a.calculerGravite()));
    }
    public List<Incident> filtrer(FiltreIncident filtre){
        List<Incident> resultat=new ArrayList<>();
        for(Incident inc : urgence){
            if(filtre.analyser(inc)){
                resultat.add(inc);
            }
        }
        return resultat;
    }

    public void afficherIncidentsCritiquesNonResolus() {
        urgence.stream()
                .filter(inc -> !inc.resolu)
                .filter(inc -> inc.niveau == NiveauUrgence.CRITIQUE)
                .forEach(inc -> System.out.println(inc.genererRapport()));
    }
}
