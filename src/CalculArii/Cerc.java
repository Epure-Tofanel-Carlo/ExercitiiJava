package CalculArii;

public class Cerc implements Calcul{
    private static final double pi=3.14;
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    @Override
    public double calculPerimetru(){
        return 2*pi*raza;
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }
}