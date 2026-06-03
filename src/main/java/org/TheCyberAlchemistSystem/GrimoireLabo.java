package org.TheCyberAlchemistSystem;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class GrimoireLabo {
    List<ArtefactMagique> encapsule;

    public GrimoireLabo(){
        encapsule=new ArrayList<>();
    }
    public void apprendreArtefact(ArtefactMagique art){
        encapsule.add(art);
    }
    public void trierParNom(){
        Collections.sort(encapsule);
    }
    public void trierParPuissanceDestructive(){
        encapsule.sort((a,b)->Double.compare(b.calculerPuissance(),a.calculerPuissance()));
    }
    public List<ArtefactMagique> filtrerSorts(FiltreGrimoire filtre){
        List<ArtefactMagique> res = new ArrayList<>();
        for(ArtefactMagique art: encapsule){
            if(filtre.verifier(art)) {
                res.add(art);
            }
        }

        return res;
    }
    public void afficherSortsInterdits(){
        encapsule.stream()
                .filter(art->art.protege==true)
                .filter(art->art.calculerPuissance()>100.0)
                .forEach(art-> System.out.println(art.lancerSort()));
    }
}
