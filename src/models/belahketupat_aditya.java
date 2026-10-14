/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ThinkPad
 */
public class belahketupat_aditya extends BangunDatar {
// 1. Atribut
    private double sisi;
    private double diagonal1;
    private double diagonal2;
    

    // 2. Satu Konstruktor (Konstruktor Kosong)
    public belahketupat_aditya() {
        this.sisi = 0;
        this.diagonal1 = 0;
        this.diagonal2 = 0;
    }

    // 3. Getter & Setter Atribut Input
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    // 4. Method Perhitungan
    @Override
    public void hitungLuas() {
        luas = 0.5 * diagonal1 * diagonal2;
    }
    
    @Override
    public void hitungKeliling() {
        keliling = 4 * sisi;
    }

    
}

