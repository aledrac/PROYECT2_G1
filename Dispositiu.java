/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2mobilewolrd;

/**
 *
 * @author Joan
 */
public abstract class Dispositiu {
    private String marca;
    private String model;
    private double preuBase;

    public Dispositiu(String marca, String model, double preuBase) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }

    @Override
    public String toString() {
        return "Dispositiu{" + "marca=" + marca + ", model=" + model + ", preuBase=" + preuBase + '}';
    }
    
    
}
