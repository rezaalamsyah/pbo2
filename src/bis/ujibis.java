/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bis;

/**
 *
 * @author santuy
 */
public class ujibis {
    public static void main(String[]abc){
        Bis bus = new Bis(5);
        bus.getpenumpang(17);
        bus.getpenumpang(24);
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang (2);//tambah 2 penumpang
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang(1);//tambah 1 penumpang
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang(2);//tambah 2 penumpang
        bus.cetakpenumpang();
         //penambahan penumpang
        bus.addpenumpang(2);//tambah 2 penumpang
        bus.cetakpenumpang();
    }
}
