package jobsheet06;

import java.util.Scanner;

public class Latihan3RentalMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variabel
        int biayaSewa = 300000;
        int biayaSupir = 200000;
        int biayaBahanBakar = 1000;
        int lamaSewa;
        int jarakTempuh = 0;
        int totalBiaya;

        // input
        System.out.println("lama sewa");
        lamaSewa = sc.nextInt();

        if (lamaSewa >= 30) {
            System.out.println("lama sewa maks 30 hari");
        } else {
            biayaSewa = 300000 * lamaSewa;
            biayaSupir = 200000 * lamaSewa;
            biayaBahanBakar = 1000 * jarakTempuh;
            totalBiaya = biayaSewa + biayaSupir + biayaBahanBakar;
            System.out.println("total biaya sewa mobil =" + totalBiaya);
            sc.close();
        }
    }

}
