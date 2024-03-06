package org.example.task2;

public class NamoProjektas {
    private int statybosMetai;
    private String energingumoKlase;
    private String adresas;

    public NamoProjektas(int statybosMetai, String energingumoKlase, String adresas) {
        this.statybosMetai = statybosMetai;
        this.energingumoKlase = energingumoKlase;
        this.adresas = adresas;
    }
    public void piesti(){
        System.out.printf("Piešti: %s", getClass().getName());
    }
}
