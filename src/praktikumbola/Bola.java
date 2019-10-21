/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumbola;

/**
 *
 * @author santuy
 */
public class Bola {
    private double jarijari;

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public void showDiameter(){
        System.out.println("Diameter = "+ 2*jarijari);
    }
    public void showLuaspermukaan(){
        System.out.println("Luas permukaan bola = "+ Math.PI*jarijari*jarijari*4);
    }
    public void showVolume(){
        System.out.println("Volume Bola = "+ Math.PI*jarijari*jarijari*jarijari*4/3);
    }
}
