package org.example.task2;

public class NamoProjektas implements Funkcijos{
    private int statybosMetai;
    private String energingumoKlase;
    private String adresas;

    public NamoProjektas(int statybosMetai, String energingumoKlase, String adresas) {
        this.statybosMetai = statybosMetai;
        this.energingumoKlase = energingumoKlase;
        this.adresas = adresas;
    }

    @Override
    public String toString() {
        return "statybosMetai=" + statybosMetai +
                ", energingumoKlase='" + energingumoKlase + '\'' +
                ", adresas='" + adresas + '\'';
    }

    public void piesti() {
        System.out.println("Piešti namo projektą");
    }
}
