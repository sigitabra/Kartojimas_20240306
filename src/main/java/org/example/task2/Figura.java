package org.example.task2;

public abstract class Figura {
    private String spalva;
    private boolean uzpildyta;

    protected Figura(String spalva, boolean uzpildyta) {
        this.spalva = spalva;
        this.uzpildyta = uzpildyta;
    }

    abstract double apskaiciuotiPlota();

    @Override
    public String toString() {
        return "spalva='" + spalva + '\'' +
                ", uzpildyta=" + uzpildyta;
    }

    public String getSpalva() {
        return spalva;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }

    public boolean isUzpildyta() {
        return uzpildyta;
    }

    public void setUzpildyta(boolean uzpildyta) {
        this.uzpildyta = uzpildyta;
    }
}
