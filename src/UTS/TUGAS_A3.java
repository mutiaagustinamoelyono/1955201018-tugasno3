/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ACER
 */
public class TUGAS_A3 {
    public static void main(String[] args) {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));     
        //Deklarasi Variable
        final double phi = 3.14;
        double r, luas, keliling;
        
        System.out.println(">>>>> MENGHITUNG LUAS DAN KELILING LINGKARAN <<<<<");
        try {
            System.out.print("Masukan Panjang Jari-Jari: ");
            //Mendapatkan Input
            r = Double.parseDouble(input.readLine());
            //Menghitung Luas dan Keliling
            luas = phi * r *r;
            keliling = 2 * phi * r;
            
            //Menampilkan Hasil
            System.out.println("Luas Lingkaran: "+ luas);
            System.out.println("Keliling Lingkaran: "+ keliling);
        } catch (IOException ex) {
            System.out.println("Terjadi Kesalahan");
        }
    }
}