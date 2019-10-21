/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bushimme;

/**
 *
 * @author santuy
 */
public class ujibes {
    public static void main(String []arg){
        //membuat objek busBesar dari class bes
        bes busBesar = new bes(40);
        busBesar.cetak();
        
        //penambah penumpang 
        busBesar.addPenumpang (15);//menambah 15 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5);//menambah 5 penumpang
        busBesar.cetak();
        
        //penambah penumpang
        busBesar.addPenumpang(26);//menambahkan 26 penumpang
        busBesar.cetak();
    }
}
