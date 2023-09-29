package ticactividades.practica2proyectos;

public class Smartphone extends Dispositiu implements GammaAlta{
    private String so;
    private boolean accelerometre;
    private boolean gps;

    public Smartphone(String so, boolean accelerometre, boolean gps, String marca, String model, double preuBase) {
        super(marca, model, preuBase);
        this.so = so;
        this.accelerometre = accelerometre; 
        this.gps = gps;
    }

    public Smartphone(String so, String marca, String model, double preuBase) {
        this(so, false, true, marca, model, preuBase);
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public boolean isAccelerometre() {
        return accelerometre;
    }

    public void setAccelerometre(boolean accelerometre) {
        this.accelerometre = accelerometre;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "so='" + so + '\'' +
                ", accelerometre=" + accelerometre +
                ", gps=" + gps +
                "} " + super.toString();
    }

    public double preuFinal() {
        double preuBase = getPreuBase();
        if (this.isAccelerometre()) {
            preuBase *= 1.10;
            if (isGps()) {
                preuBase *= 1.05;
            }
        }
        return 2 * preuBase;
    }

    @Override
    public boolean isGammaAlta() {
        return this.preuFinal() > 700;
    }
}
