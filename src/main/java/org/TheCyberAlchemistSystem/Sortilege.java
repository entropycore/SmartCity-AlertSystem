package org.TheCyberAlchemistSystem;

public class Sortilege extends ArtefactMagique {
    private int niveauMana;

    public Sortilege(String id,String n,ElementMagique el,int nv){
        super(id,n,el);
        niveauMana=nv;
    }

    @Override
    public double calculerPuissance() {
        return niveauMana*element.getMultiplier();
    }

    @Override
    public String lancerSort() {
        return "incantation :" + getNom() + "\n Element: "+element +" Mana consomme: "+niveauMana + "MP\n"+"degat infliges: "+calculerPuissance()+" points de vie au monstre!";
    }
}
