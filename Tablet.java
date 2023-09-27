/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2mobilewolrd;

/**
 *
 * @author Joan
 */
public class Tablet extends Dispositiu {
    private double polsades;
    
    public Tablet(double polsades, String marca, String model, double preuBase) {
        super(marca, model, preuBase);
        this.polsades = polsades;
    }

    public double getPolsades() {
        return polsades;
    }

    public void setPolsades(double polsades) {
        this.polsades = polsades;
    }

    @Override
    public String toString() {
        return "Tablet{" + "polsades=" + polsades + '}';
    }
    
}
