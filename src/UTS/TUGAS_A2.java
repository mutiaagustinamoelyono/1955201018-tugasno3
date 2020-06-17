/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class TUGAS_A2 {
    public static void main(String[] args) {
        int panjang= Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));
        int lebar= Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar"));
        int tinggi= Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi"));
        int hitung= panjang*lebar*tinggi;
        String tampil="Hasil hitung Volume Balok adalah " + hitung + " satuan volume";
        JOptionPane.showMessageDialog(null, tampil,"Hasil Hitung" ,JOptionPane.INFORMATION_MESSAGE);
    }
}
