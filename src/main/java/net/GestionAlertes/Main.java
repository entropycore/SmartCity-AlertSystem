package net.GestionAlertes;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CentreDeControle centre = new CentreDeControle();


        Incident i1 = new AlertTrafic("INC-01", "Autoroute A3", NiveauUrgence.CRITIQUE, 4);
        Incident i2 = new AlertTrafic("INC-02", "Centre Ville", NiveauUrgence.FAIBLE, 2);
        Incident i3 = new AlertePollution("INC-03", "Zone Industrielle", NiveauUrgence.MOYEN, 40.5);
        Incident i4 = new AlertePollution("INC-04", "Quartier Residentiel", NiveauUrgence.CRITIQUE, 80.0);

        centre.declarerIncident(i1);
        centre.declarerIncident(i2);
        centre.declarerIncident(i3);
        centre.declarerIncident(i4);

        System.out.println(" INCIDENTS CRITIQUES (URGENT) ");
        centre.afficherIncidentsCritiquesNonResolus();


        System.out.println("\n--- FILTRAGE LAMBDA (Gravité > 15) ---");

        List<Incident> urgencesGraves = centre.filtrer( (inc) -> inc.calculerGravite() > 15.0 );


        for (Incident u : urgencesGraves) {
            System.out.println(u.getIdIncident() + " - Gravité : " + u.calculerGravite());
        }
    }
}