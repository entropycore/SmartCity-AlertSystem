package net.GestionAlertes;

public class AlertePollution extends Incident {
    private double tauxParticules;

    public AlertePollution(String id,String lieu,NiveauUrgence nv,double tp){
        super(id,lieu,nv);
        tauxParticules=tp;
    }

    @Override
    public double calculerGravite() {
        return tauxParticules*niveau.getMultiplicateur();
    }

    @Override
    public String genererRapport() {
        return "probleme pollution dans " + lieu +" : \n avec un taux de particules :"+ tauxParticules +"avec niveau d urgence :"+ niveau;
    }
}
