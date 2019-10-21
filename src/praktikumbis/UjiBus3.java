/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumbis;

/**
 *
 * @author santuy
 */
public class UjiBus3 {
    public static void main(String[] args) {
        Bus3 Bus = new Bus3(200);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        //penambahan
        Bus.addpenumpang(49);
        Bus.getAverage();
        Bus.cetakpenumpang();
        //penambahan
        Bus.addpenumpang(50);
        Bus.getAverage();
        Bus.cetakpenumpang();
        //penambahan
        Bus.addpenumpang(68);
        Bus.getAverage();
        Bus.cetakpenumpang();
        //penambahan
        Bus.addpenumpang(86);
        Bus.getAverage();
        Bus.cetakpenumpang();
        Bus.addpenumpang(75);
        Bus.getAverage();
        Bus.cetakpenumpang();
        
    }
}
