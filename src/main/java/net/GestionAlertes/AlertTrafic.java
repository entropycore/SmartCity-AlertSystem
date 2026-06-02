package net.GestionAlertes;

public class AlertTrafic extends Incident  {
    private int vehiculesImpliques;
    public AlertTrafic(String id,String lieu,NiveauUrgence nv ,int vh){
        super(id,lieu,nv);
        vehiculesImpliques=vh;
    }

    @Override
    public double calculerGravite(){
        return vehiculesImpliques * niveau.getMultiplicateur();
    }
    @Override
    public String genererRapport(){
        return "accident au trafic dans " + lieu +" : \n avec un nombre de vehicules :"+ vehiculesImpliques +"avec niveau d urgence :"+ niveau;
    }

}
