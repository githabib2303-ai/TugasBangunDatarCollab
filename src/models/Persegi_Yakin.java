/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author achmad_khusnul_yakin
 */

/**
 * Class Persegi_Yakin
 * Nama : Achmad Khusnul Yakin
 * Nim : 202557201001
 * Prodi : Sistem Informasi
 * Semester : 3
 * Tugas Kelompok 6 PBO - Bangun Datar
 */
public class Persegi_Yakin {
    
    // 1. Atribut
    private double sisi;
    private double luas;
    private double keliling;

    // 2. Satu Konstruktor (Konstruktor Kosong)
    public Persegi_Yakin() {
        this.sisi = 0;
        this.luas = 0;
        this.keliling = 0;
    }

    // 3. Getter & Setter Sisi
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // 4. Method Perhitungan
    public void hitungLuas() {
        this.luas = this.sisi * this.sisi;
    }

    public void hitungKeliling() {
        this.keliling = 4 * this.sisi;
    }

    // 5. Getter Hasil Luas dan Keliling
    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }
}