/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author user
 */
public class Lingkaran_Audi extends BangunDatar{
    public double jari_jari;
    public double phi = 3.14;
    
    
    public Lingkaran_Audi(){
        this.jari_jari= 0.0;
    }
    
    public Lingkaran_Audi(double jari_jari, double phi){
        this.jari_jari = jari_jari;
        this.phi = phi;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double getDiameter() {
        return 2 * jari_jari;
    }

    //public double getLuas() {
     //   return phi * jari_jari * jari_jari;
    //}

    //public double getKeliling() {
     //   return 2 * phi * jari_jari;
   // }

    //public double getJari_jari() {
     //   return jari_jari;
    @Override
    //method untuk menghitung luas dan keliling
    public void hitungLuas(){
     luas = phi * jari_jari * jari_jari;
    }
    @Override 
    public void hitungKeliling(){
     keliling = 2 * phi * jari_jari;
    }

    

    
}