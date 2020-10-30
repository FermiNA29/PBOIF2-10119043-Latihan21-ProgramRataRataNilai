/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program mencari nilai rata-rata
 */
public class PBOIF210119043Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    
    public static int banyakMhs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan banyaknya mahasiswa : ");
        int banyakMhs = scanner.nextInt();
        return banyakMhs;
    }
    
    public static float[] ulang(int banyakMhs) {
        Scanner scanner = new Scanner(System.in);
        float[] nilaiMhs = new float[banyakMhs];
        for(int i=0; i<=banyakMhs-1; i++) {
            System.out.print("Mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = scanner.nextInt();
        }
        return nilaiMhs;
    }
    
    public static void hasil(float[] nilaiMhs) {
        float nilai = 0;
        float rataRata;
        for(int i=0; i < nilaiMhs.length; i++) {
            nilai = nilai + nilaiMhs[i];
        }
        rataRata = nilai / nilaiMhs.length;
        System.out.println();
        System.out.println("Maka, Rata-rata nilainya adalah " + rataRata);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Developed by : Fermi Naufal Akbar");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        hasil(ulang(banyakMhs()));
    }
    
}
