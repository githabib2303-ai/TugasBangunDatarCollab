/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ACER
 */
public class Segitiga_shofi extends BangunDatar{
public  double alas;
public  double tinggi;
public  double sisiA;
public  double sisiB;
public  double sisiC;
//public  double luas;
//public  double keliling;

    public Segitiga_shofi(){
        alas = 0.0;
        tinggi = 0.0;
        sisiA = 0.0;
        sisiB = 0.0;
        sisiC = 0.0;
    }

    public Segitiga_shofi(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisiA(double sisiA) {
        this.sisiA = sisiA;
    }

    public void setSisiB(double sisiB) {
        this.sisiB = sisiB;
    }

    public void setSisiC(double sisiC) {
        this.sisiC = sisiC;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getSisiA() {
        return sisiA;
    }

    public double getSisiB() {
        return sisiB;
    }

    public double getSisiC() {
        return sisiC;
    }

//    public double getLuas() {
//        luas = 0.5 * alas * tinggi  ;
//        return luas;
//    }
//
//    //public double getKeliling() {
//    // keliling = sisiA + sisiB + sisiC;
//        return keliling;
    @Override
    //method untuk menghitung luas dan keliling 
    public void hitungLuas(){
     luas = 0.5 * alas * tinggi;
    }
    @Override
    public void hitungKeliling(){
     keliling = sisiA + sisiB + sisiC;
    
        }
}
