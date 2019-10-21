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
public class Bus3 {
    public double penumpang;
    public double maxpenumpang;
    public int counter = 0;
    public double penumpangbaru;
    public double ratarata;
    public Bus3(double maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //method mutator
    public void addpenumpang(double penumpang){
        double temp;
        
        temp = this.penumpang+penumpang;
        if(temp > maxpenumpang){
            System.out.println("Berat badan penumpang melebihi kuota");
        }else{
            this.penumpang=temp;
        }
        counter++;
    }
    public void getpenumpang(int password){
        if(password==24){
            System.out.println("Password benar");
        }else{
            System.out.println("Password salah");
        }
    } 
    public void getAverage(){
         ratarata = this.penumpang/counter;
    }
    public void cetakpenumpang(){
        System.out.println("berat penummpang Bus sekarang = "+penumpang);
        System.out.println("Berat maksimum penumpang seharusnya  adalah = "+maxpenumpang);
        System.out.println("Rata-rata berat badan penumpang = "+ratarata );
    }
}
