package Jobsheet09; 

import java.util.Scanner;

import Jobsheet08.NilaiKelompok27;

public class ArrayNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         int [] nilaiAkhir = new int [10];

         for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("masukkan nilai akhir ke-"+i+":");
            nilaiAkhir [i] = sc.nextInt ();
         }
         System.out.println();
         for (int i = 0; i < nilaiAkhir.length; i++){
                if (nilaiAkhir [i] > 70) {
                System.out.println("mahasiswa ke-"+i+"LULUS!");
            } else {
                System.out.println("mahasiswa ke-"+i+" TIDAK LULUS!");
            }
        }
    }
    
}
