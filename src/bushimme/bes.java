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
public class bes {
    private int penumpang;
    private int maxPenumpang;
    
    //konstruktor kelas bus
    public bes(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
        
    }
    //method mutator untuk menambah penumpang
    public void addPenumpang(int penumpang ){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp >= maxPenumpang){
            System.out.println("penumpang melebihi kuota");
            
        }else {
            this.penumpang = temp;
        }
    }
    public void cetak (){
        System.out.println("penumpang bus sekarang adalah "+penumpang);
        System.out.println("penumpang maksimum seharusnya adalah "+maxPenumpang);
    }
}


