package org.example.biblioteka;

abstract class Leidinys {
    private String id;
    private String pavadinimas;
    private String islaidimoMetai;

    protected Leidinys(String id, String pavadinimas, String islaidimoMetai) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.islaidimoMetai = islaidimoMetai;
    }


    public void info() {
        System.out.println(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getIslaidimoMetai() {
        return islaidimoMetai;
    }

    public void setIslaidimoMetai(String islaidimoMetai) {
        this.islaidimoMetai = islaidimoMetai;
    }
}
