/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author acer
 */
public class persegiPanjang_Khabib extends BangunDatar{
    //membuat atribut
    public double panjang;
    public double lebar;
//    public double luas;
//    public double keliling;
    
    
    //membuat konstruktor kosong
    public persegiPanjang_Khabib(){
        this.panjang = 0;
        this.lebar = 0;  
    }

    //konstruktor parameter
//     public persegiPanjang_Khabib(double panjang , double lebar){
//        this.panjang = panjang;
//        this.lebar = lebar;  
//    }
     
     //membuat getter dan setter
    public double getPanjang() {
        return panjang;
    }
 
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
  
    public double getLebar() {
        return lebar;
    }
    
     public void setLebar(double lebar){
        this.lebar = lebar;
    }
    
//      public double getLuas() {
//        return luas;
//    }
//
//    public double getKeliling() {
//        return keliling;
//    }
     
    @Override
     //method untuk menghitung luas dan keliling
     public void hitungLuas(){
         luas = panjang*lebar;
     }
     @Override
     public void hitungKeliling(){
         keliling =  2*(panjang + lebar);
     }
     
     
}
