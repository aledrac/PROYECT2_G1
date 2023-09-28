/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package proyecto2mobilewolrd;

/**
 *
 * @author aleix
 */
public class AltresDispositius extends Dispositiu {
    private String descripcioDispositiu;
    
    public AltresDispositius(String descripcioDispositiu, String marca, String model, double preuBase) {
        super(marca, model, preuBase);
        this.descripcioDispositiu = descripcioDispositiu;
    }

    public String getDescripcioDispositiu() {
        return descripcioDispositiu;
    }

    public void setDescripcioDispositiu(String descripcioDispositiu) {
        this.descripcioDispositiu = descripcioDispositiu;
    }

    @Override
    public String toString() {
        return super.toString() + " descripcioDispositiu=" + descripcioDispositiu + '}';
    }
}
