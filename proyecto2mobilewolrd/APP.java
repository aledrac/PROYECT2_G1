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
        dis[1] = new Smartphones("Samsung", "S10", 300,"android", false, true);
        dis[2] = new Smartphones("Apple", "iPhone 11", 500, "IOS", true, true);
        dis[3] = new Tablet(12, "Samsung", "Galaxi Tab", 400);
        dis[4] = new Tablet(10, "Apple", "iPad Air", 600);
//        for(int i = 0; i < dis.length; i++){
//            System.out.println(dis[i]);
//            System.out.println(dis[i].precioFinal());
//            if(dis[i] instanceof GammaAlta){
//                System.out.println("Gamma alta " + ((GammaAlta)dis[i]).isGammaAlta());
//            }
//        }

//        System.out.println(""); 
//        Smartphones[] s = new Smartphones[2];
//        Tablets[] t = new Tablets[2];
//        s[0] = (Smartphones)dis[1];
//        s[1] = (Smartphones)dis[2];
//        t[0] = (Tablets)dis[3];
//        t[1] = (Tablets)dis[4];
//        for(int i = 0; i < s.length; i++){
//            System.out.println(s[i]);
//            System.out.println(s[i].precioFinal());
//            System.out.println(s[i].isGammaAlta());
//        }
//        for(int i = 0; i < t.length; i++){
//            System.out.println(t[i]);
//            System.out.println(t[i].precioFinal());
//            System.out.println(t[i].isGammaAlta());
//        }
    }
}