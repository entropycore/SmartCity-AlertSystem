package com.preparation;



public class Main {

    public static void main(String[] args) {

        try {
            produit p1 = new produitSolde("Stylo", 10, 5, 0.2);
            System.out.println(p1);
            System.out.println("Total: " + p1.prixtotal());

        } catch (produitexception e) {
            System.out.println("Erreur: " + e.getMessage());

        } finally {
            System.out.println("Fin du programme (toujours exécuté)");
        }
    }
}
