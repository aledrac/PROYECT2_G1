package proyecto2mobilewolrd;

public class Smartphone extends Dispositiu {
    private String sistemaOperatiu;
    private boolean acceleròmetre;
    private boolean gps;

    public Smartphone(String marca, String model, double preuBase, String sistemaOperatiu, boolean acceleròmetre , boolean gps) {
        super(marca, model, preuBase);
        this.sistemaOperatiu = sistemaOperatiu;
        this.acceleròmetre = acceleròmetre;
        this.gps = gps;
    }

    public boolean isAcceleròmetre() {
        return acceleròmetre;
    }

    public void setAcceleròmetre(boolean acceleròmetre) {
        this.acceleròmetre = acceleròmetre;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
    
    public String getSistemaOperatiu() {
        return sistemaOperatiu;
    }

    public void setSistemaOperatiu(String sistemaOperatiu) {
        this.sistemaOperatiu = sistemaOperatiu;
    }

    @Override
    public String toString() {
        return super.toString() + "sistemaOperatiu=" + sistemaOperatiu + ", acceler\u00f2metre=" + acceleròmetre + ", gps=" + gps + '}';
    }

    
}
