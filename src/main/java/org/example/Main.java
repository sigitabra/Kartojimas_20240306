package org.example;

import org.example.biblioteka.Biblioteka;
import org.example.biblioteka.Knyga;
import org.example.biblioteka.Zurnalas;
import org.example.task2.Apskritimas;
import org.example.task2.NamoProjektas;
import org.example.task2.Staciakampis;

public class Main {
    public static void main(String[] args) {
//        Biblioteka bib = new Biblioteka();
//        bib.pridetiKnyga(new Knyga("K01", "Altorių šešėlyje", "1965 m.", "V. M. Putinas"));
//        bib.pridetiZurnala(new Zurnalas("Z01", "Valstybė", "2023 m.", "1000 vnt.", "Tyto alba"));
//        bib.rodytiInventoriu();

        Apskritimas ap=new Apskritimas("Balta",true, 1.24d);
        Staciakampis st=new Staciakampis("Juoda", true, 12.56d,13.45d);
        NamoProjektas namas=new NamoProjektas(2000, "A1","Lauku g. 10, Vilnius");
        bendraFunkcija(namas);

    }

    public <T> void bendriLaukai(T object) {


    }

    public static <T> void bendraFunkcija(T object) {

    }

}