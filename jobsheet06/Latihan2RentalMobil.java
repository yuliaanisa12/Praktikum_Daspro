package jobsheet06;

import java.util.Scanner;

public class Latihan2RentalMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variabel
        int biayaSewa = 300000;
        int biayaSupir = 200000;
        int biayaBahanBakar = 1000;
        int lamaSewa;
        int jarakTempuh;
        int totalBiaya;
        double diskon = 0.05;
        double totalBiayaakhir = 0;

        // input
        System.out.println("lama sewa");
        lamaSewa = sc.nextInt();
        System.out.println("jarak tempuh (per KM):");
        jarakTempuh = sc.nextInt();

        biayaSewa = 300000 * lamaSewa;
        biayaSupir = 200000 * lamaSewa;
        biayaBahanBakar = 1000 * jarakTempuh;
        totalBiaya = biayaSewa + biayaSupir + biayaBahanBakar;

        if (totalBiaya >= 200000) {
            diskon = totalBiaya * 0.05;
            totalBiaya = totalBiaya - (int) diskon;
            System.out.println("mendapat diskon 5%!");
        }
        System.out.println("total Biaya = " + totalBiayaakhir);
        sc.close();
    }
}
