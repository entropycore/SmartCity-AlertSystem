package org.TheCyberAlchemistSystem;

import java.util.List;
public class Main {
    public static void main(String[] args ){
        GrimoireLabo grimoire= new GrimoireLabo();

        Sortilege s1=new Sortilege("sp01","boule de feu",ElementMagique.FEU,40);
        Sortilege s2 = new Sortilege("sp02","souffle de glace",ElementMagique.GLACE,15);
        Potion p1=new Potion("pot01","emulsiond ombre obscure",ElementMagique.OMBRE,25);
        Potion p2= new Potion("pot02","potion de soin asique",ElementMagique.GLACE,5);

        s1.protege=true;
        p1.protege=true;

        grimoire.apprendreArtefact(s1);
        grimoire.apprendreArtefact(s2);
        grimoire.apprendreArtefact(p1);
        grimoire.apprendreArtefact(p2);

        System.out.println("-----SCAN STREAM: ARTEFACTS PROTEGES ET PUISSANTS (>100)----");
        grimoire.afficherSortsInterdits();


        System.out.println("---- FILTRAGE LAMBDA: LES SORTS D ELEMENT GLACE-----");

        List<ArtefactMagique>sortGlace=grimoire.filtrerSorts(art->art.element==ElementMagique.GLACE);

        for (ArtefactMagique art: sortGlace){
            System.out.println(art.getNom()+" puissance "+art.calculerPuissance());
        }
    }
}
