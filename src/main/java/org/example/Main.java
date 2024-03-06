package org.example;

import org.example.biblioteka.Biblioteka;
import org.example.biblioteka.Knyga;
import org.example.biblioteka.Zurnalas;


public class Main {
    public static void main(String[] args) {
        Biblioteka bib = new Biblioteka();
        bib.pridetiKnyga(new Knyga("K01", "Altorių šešėlyje", "1965 m.", "V. M. Putinas"));
        bib.pridetiZurnala(new Zurnalas("Z01", "Valstybė", "2023 m.", "1000 vnt.", "Tyto alba"));
        bib.rodytiInventoriu();


    }


}