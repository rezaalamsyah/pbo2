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
public class Bis {

   public int penumpang;
   public int maxpenumpang;
   
   public Bis (int maxpenumpang){
       this.maxpenumpang = maxpenumpang;
       penumpang = 0;
   }
    //Method Mutator
   public void addpenumpang(int penumpang)
   {
       int temp;
       temp = this.penumpang+penumpang;
       if (temp> maxpenumpang)
       {
           System.out.println("Penumpang melebihi kuota");
       }
       else{
           this.penumpang = temp;
       }
   }
    public void getpenumpang(int password){
        if (password==24){
            System.out.println("Password benar");
        }
        else
        {
            System.out.println("password salah");
        }
    }
    public void cetakpenumpang(){
        System.out.println("penumpang bus sekarang = "+ penumpang);
        System.out.println("maximum penumpang yang seharusnya adalah = "+ maxpenumpang);
    }
}
