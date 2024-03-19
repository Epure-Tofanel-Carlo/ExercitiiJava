package CalculArii;

public class Patrat implements Calcul {
    private double lungime;
    private double latime;

    public Patrat(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public double calculPerimetru(){
        return lungime*latime;
    };

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }
}