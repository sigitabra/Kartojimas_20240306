package org.example;

import org.example.biblioteka.Biblioteka;
import org.example.biblioteka.Knyga;
import org.example.biblioteka.Zurnalas;
import org.example.task2.*;

public class Main {
    public static void main(String[] args) {
        Biblioteka bib = new Biblioteka();
        bib.pridetiKnyga(new Knyga("K01", "Altorių šešėlyje", "1965 m.", "V. M. Putinas"));
        bib.pridetiZurnala(new Zurnalas("Z01", "Valstybė", "2023 m.", "1000 vnt.", "Tyto alba"));
        bib.rodytiInventoriu();

        System.out.println();

        Apskritimas ap = new Apskritimas("Balta", true, 1.24d);
        Staciakampis st = new Staciakampis("Juoda", true, 12.56d, 13.45d);
        NamoProjektas namas = new NamoProjektas(2000, "A1", "Vasaros g. 5, Vilnius");

        bendriFiguruLaukai(ap);
        bendriFiguruLaukai(st);

        bendraFunkcija(ap);
        bendraFunkcija(st);
        bendraFunkcija(namas);
    }

    public static <T> void bendriFiguruLaukai(T object) {
        System.out.println(object);
    }

    public static void bendraFunkcija(Funkcijos object) {
        object.piesti();
    }

}