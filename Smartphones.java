package proyecto2mobilewolrd;

public class Smartphone extends Dispositiu {
    private String sistemaOperatiu;

    public Smartphone(String marca, String model, double preuBase, String sistemaOperatiu) {
        super(marca, model, preuBase);
        this.sistemaOperatiu = sistemaOperatiu;
    }

    public String getSistemaOperatiu() {
        return sistemaOperatiu;
    }

    public void setSistemaOperatiu(String sistemaOperatiu) {
        this.sistemaOperatiu = sistemaOperatiu;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSistema Operatiu: " + sistemaOperatiu;
    }
}
