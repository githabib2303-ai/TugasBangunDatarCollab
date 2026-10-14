/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author user
 */
public class Lingkaran_Audi extends BangunDatar {

    public double jari_jari;

    public Lingkaran_Audi() {
        this.jari_jari = 0.0;
    }

    public Lingkaran_Audi(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    //method untuk menghitung luas 
    @Override
    public void hitungLuas() {
        luas = Math.PI * jari_jari * jari_jari;
    }

    //method untuk menghitung keliling
    @Override
    public void hitungKeliling() {
        keliling = 2 * Math.PI * jari_jari;
    }

}
