/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2mobilewolrd;

/**
 *
 * @author Sebastian
 */

public class APP {
    public static void main(String[] args) {
        Dispositiu[] dis = new Dispositiu[5];
        dis[0] = new AltresDispositius("Reloj inteligente","Apple", "SE", 100);
        dis[1] = new Smartphone("Samsung", "S10", 300,"android", false, false);
        dis[2] = new Smartphone("Apple", "iPhone 11", 500, "IOS", true, true);
        dis[3] = new Tablet(12, "Samsung", "Galaxi Tab", 400);
        dis[4] = new Tablet(10, "Apple", "iPad Air", 600);
        for (Dispositiu di : dis) {
            System.out.println(di.toString());
        }
    }
}