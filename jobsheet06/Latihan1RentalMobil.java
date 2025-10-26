package jobsheet06;

import java.util.Scanner;

public class Latihan1RentalMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Buat variabel
        int biayaSewa = 300000;
        int biayaSupir = 200000;
        int biayaBahanBakar = 1000;
        int lamaSewa;
        int totalBiaya;
        int biayaBMM_Per_km = 0;
        int jarakTempuh;
        String bahanbakar;

        // Perintah untuk menginput
        System.out.println("lama sewa");
        lamaSewa = sc.nextInt();
        System.out.println("jarak tempuh (per KM):");
        jarakTempuh = sc.nextInt();
        System.out.println("pilih BBM (pertalite/pertamax)");
        bahanbakar = sc.next();

        if (bahanbakar.equalsIgnoreCase("pertalite")) {
            biayaBMM_Per_km = 1000;
        } else if (bahanbakar.equalsIgnoreCase("pertamax")) {
            biayaBMM_Per_km = 1300;
        } else {
            System.out.println("jenis bahan bakar tidak ada");
        }

        biayaSewa = 300000 * lamaSewa;
        biayaSupir = 200000 * lamaSewa;
        biayaBahanBakar = biayaBMM_Per_km * jarakTempuh;
        totalBiaya = biayaSewa + biayaSupir + biayaBahanBakar;
        System.out.println("total Biaya sewa mobil = " + totalBiaya);
        sc.close();
    }
}
