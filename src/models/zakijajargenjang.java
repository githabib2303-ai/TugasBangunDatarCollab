/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author zaki reza
 */
public class zakijajargenjang extends BangunDatar{
    
private double alas;
private double tinggi;
private double sisimiring;


    public zakijajargenjang() {
           alas = 0.0;
           tinggi = 0.0;
           sisimiring = 0.0;
    }
 
    public zakijajargenjang(double alas, double tinggi, double sisimiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisimiring = sisimiring;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSisimiring() {
        return sisimiring;
    }

    public void setSisimiring(double sisimiring) {
        this.sisimiring = sisimiring;
    }
    
    @Override
    public void hitungLuas() {
        luas = alas * tinggi; 
    }
    @Override
    public void hitungKeliling() {
        keliling = 2 * (alas + sisimiring);
     
    }
    
}
