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
public class TUGAS_B1 {
    public static void main(String[] args) {
// Buat Scanner
Scanner input = new Scanner(System.in);
// Ambil Nilai
System.out.print("Masukkan nilai sesuai keinginanmu = ");
int nilai = input.nextInt();
//proses if else
if(nilai <= 55){
// Print
System.out.println("E");
}else if (nilai >= 56 && nilai <= 65){
System.out.println("D");
}else if (nilai >= 66 && nilai <=75){
System.out.println("C");
}else if (nilai >= 76 && nilai <= 85){
System.out.println("B");
}else if (nilai >= 86 && nilai <= 100){
System.out.println("A");
} else {
System.out.println("ERROR");
}
}
}
