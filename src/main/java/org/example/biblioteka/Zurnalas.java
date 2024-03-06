package org.example.biblioteka;

public class Zurnalas extends Leidinys {

    private String tirazas;
    private String leidykla;

    public Zurnalas(String id, String pavadinimas, String islaidimoMetai, String tirazas, String leidykla) {
        super(id, pavadinimas, islaidimoMetai);
        this.tirazas = tirazas;
        this.leidykla = leidykla;
    }

    @Override
    public String toString() {
        return "Zurnalas{" + "id='" + super.getId() + '\'' +
                ", pavadinimas='" + super.getPavadinimas() + '\'' +
                ", islaidimoMetai='" + super.getIslaidimoMetai() + '\'' +
                ", tirazas='" + tirazas + '\'' +
                ", leidykla='" + leidykla + '\'' +
                '}';
    }


}
