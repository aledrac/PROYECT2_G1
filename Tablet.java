/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2mobilewolrd;

/**
 *
 * @author Joan
 */
public class Tablet extends Dispositiu implements GammaAlta{
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
        return super.toString() + " polsades=" + polsades + '}';
    }
    @Override
    public double precioFinal() {
        if(polsades >= 10){
            return super.precioFinal() * 1.10;
        }
        return super.precioFinal();
    }

    @Override
    public boolean isGammaAlta() {
        return precioFinal() > 900;
    }
    
}
