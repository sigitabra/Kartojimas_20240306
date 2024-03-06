package org.example.task2;

public class Staciakampis extends Figura implements Plotas {
    private final double ilgis;
    private final double plotis;

    public Staciakampis(String spalva, boolean uzpildyta, double ilgis, double plotis) {
        super(spalva, uzpildyta);
        this.ilgis = ilgis;
        this.plotis = plotis;
    }

    @Override
    public double apskaiciuotiPlota() {
        if (isUzpildyta()) {
            return ilgis * plotis;
        }else{
            return 0;
        }
    }

    public void piesti(){
        System.out.printf("Piešti: %s", getClass().getName());
    }

}
