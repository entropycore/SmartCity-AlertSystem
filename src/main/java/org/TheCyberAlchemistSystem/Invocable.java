package org.TheCyberAlchemistSystem;

public interface Invocable {
    String lancerSort();
    default void dissiper(){
        System.out.println("les residus de magie se dissipent dans l'air");
    }
}
