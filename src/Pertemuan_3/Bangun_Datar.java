/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_3;

/**
 *
 * @author ACER
 */
public class Bangun_Datar {
    public static void main(String[] args) {
        //Tugas 2
        //LUAS DAN KELILING BANGUN DATAR
        //1.Persegi Panjang
        //2.Segitiga
        //3.Trapesium
        //4.Lingkaran
        System.out.println("=== LUAS KELILING BANGUN DATAR ===");
        System.out.println("PERSEGI PANJANG");
        int panjang = 10;
        int lebar = 5;
        int luas = panjang*lebar;
        int keliling = 2 * (panjang+lebar);
        System.out.println("PANJANG" +panjang);
        System.out.println("LEBAR" +lebar);
        System.out.println("LUAS" +luas);
        System.out.println("KELILING" +keliling);
        
        System.out.println("SEGITIGA");
        double alas = 5;
        double tinggi = 8;
        double l_segitiga = 0.5*alas*tinggi;
        double k_segitiga = 3*alas;
        
        System.out.println("ALAS    ="+ alas);
        System.out.println("TINGGI  ="+ tinggi);
        System.out.println("LUAS    ="+ luas);
        System.out.println("KELILING="+ keliling);
        
        System.out.println("TREPESIUM");
        double sisi_atas =5;
        double sisibawah =8;
        double miring = 7;
        double tinggi_trapesium =10;
        double luas_trap=0.5*(sisi_atas+sisibawah)+tinggi_trapesium;
        double kel_trapesium=sisi_atas+sisibawah+tinggi_trapesium+miring;
        
        System.out.println("SISI ATAS"+ sisi_atas);
        System.out.println("SISI BAWAH"+ sisibawah);
        System.out.println("MIRING"+ miring);
        System.out.println("TINGGI"+ tinggi_trapesium);
        System.out.println("LUAS TRAPESIUM "+luas_trap);
        System.out.println("KELILING TRAPESIUM "+kel_trapesium);
        
        System.out.println("LINGKARAN");
        double jari_jari = 3;
        double phi = 3.14;
        double kel_lingkaran = 5;
        double luas_lingkaran = phi* jari_jari;
        double keliling_lingkaran = 2*phi*jari_jari;
        
        System.out.println("JARI JARI"+ jari_jari);
        System.out.println("LUAS"+ luas_lingkaran);
        System.out.println("KELILING" +keliling_lingkaran);
        
    
    }
}
