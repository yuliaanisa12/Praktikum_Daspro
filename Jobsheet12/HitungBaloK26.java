package Jobsheet12;

import  java.util.Scanner;

public class HitungBaloK26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("=== PROGRAM TANPA FUNGSI ===");
        
        System.out.print("Masukkan panjang: ");
        p = input.nextInt();

        System.out.print("Masukkan lebar: ");
        l = input.nextInt();

        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        L = p * l;
        System.out.println("Luas Persegi Panjang = " + L);
        vol = p * l * t;
        System.out.println("Volume Balok = " + vol);

        System.out.println();
        System.out.println("=== PROGRAM DENGAN FUNGSI ===");

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();

        System.out.print("Masukkan lebar: ");
        l = input.nextInt();

        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang = " + L);

        vol = hitungVolume(p, l, t);
        System.out.println("Volume Balok = " + vol);

        System.out.println();
        System.out.println("=== VALIDASI HASIL (Contoh p=4, l=3, t=5) ===");

        p = 4;
        l = 3;
        t = 5;

        L = hitungLuas(p, l);
        vol = hitungVolume(p, l, t);

        System.out.println("Luas Persegi Panjang = " + L);
        System.out.println("Volume Balok = " + vol);

        input.close();
    }

    static int hitungLuas(int p, int l) {
        int L = p * l;
        return L;
    }

    static int hitungVolume(int p, int l, int t) {
        int vol = p * l * t;
        return vol;

    }
}


