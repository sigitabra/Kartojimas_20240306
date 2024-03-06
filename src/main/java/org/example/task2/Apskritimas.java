package org.example.task2;

public class Apskritimas extends Figura implements Plotas{
    private double spindulys;

    public Apskritimas(String spalva, boolean uzpildyta, double spindulys) {
        super(spalva, uzpildyta);
        this.spindulys = spindulys;
    }

    @Override
    public double apskaiciuotiPlota() {
        if (isUzpildyta()) {
            return Math.PI*spindulys*spindulys;
        }else{
            return 0;
        }
    }

    public void piesti(){
        System.out.printf("Piešti: %s", getClass().getName());
    }

}
