package org.example.biblioteka;

public class Knyga extends Leidinys {
    private String autorius;

    public Knyga(String id, String pavadinimas, String islaidimoMetai, String autorius) {
        super(id, pavadinimas, islaidimoMetai);
        this.autorius = autorius;
    }

    @Override
    public String toString() {
        return "Knyga{" +"id='" + super.getId() + '\'' +
                ", pavadinimas='" + super.getPavadinimas() + '\'' +
                ", islaidimoMetai='" + super.getIslaidimoMetai() + '\'' +
                ", autorius='" + autorius + '\'' +
                '}';
    }

}
