package org.example.biblioteka;

import java.util.ArrayList;

public class Biblioteka {
    private ArrayList<Leidinys> inventorius;

    public Biblioteka() {
        this.inventorius = new ArrayList<>();
    }

    public void pridetiKnyga(Knyga knyga) {
        inventorius.add(knyga);
    }

    public void pridetiZurnala(Zurnalas zurnalas) {
        inventorius.add(zurnalas);
    }

    public void rodytiInventoriu() {

        for (Leidinys i : inventorius) {
            i.info();
        }
    }
}
