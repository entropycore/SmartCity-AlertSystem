package org.TheCyberAlchemistSystem;

public class Potion extends ArtefactMagique{
    private int volumeIngredients;
    public Potion(String id,String n,ElementMagique el, int vm){
        super(id,n,el);
        volumeIngredients=vm;
    }
    @Override
    public double calculerPuissance(){
        return volumeIngredients* element.getMultiplier();
    }

    @Override
    public String lancerSort() {
        return "vous buvez la potion: "+getNom()+"\n"+"essence de :"+element +" volume d ingredient: "+volumeIngredients + " ml\n"+" effet: votr personnage regenere + "+calculerPuissance()+ " point d'energie!";
    }
}
