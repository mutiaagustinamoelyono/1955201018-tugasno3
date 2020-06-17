/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class TUGAS_A1 {
    public static void main(String[] args) 
    {
        int sisi, luas, keliling;      
        Scanner O=new Scanner (System.in);
        System.out.print("Masukkan sisinya : ");
        sisi=O.nextInt();
       
        luas=(sisi*sisi);
        System.out.println("Luas dari persegi adalah : "+luas);
       
        keliling=(4*sisi);
        System.out.println("Keliling dari persegi adalah : "+keliling);
    }
}
