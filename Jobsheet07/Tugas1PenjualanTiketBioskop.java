package Jobsheet07;

import java.util.Scanner;

public class Tugas1PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variabel
        int jumlahTiket;
        double hargaTiket = 50000;
        double totalharga;
        double diskon = 0;

        while (true) {
            System.out.println("maasukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket <= 0) {
                System.out.println(" imput tidak valid. jumlah tiket harus positif.");
                continue;
            }
            break;
        }
        totalharga = jumlahTiket * hargaTiket;

        if (jumlahTiket > 10) {
            diskon = 0.15;
        } else if (jumlahTiket >= 4 && jumlahTiket <= 10) {
            diskon = 0.10;
        }
        double hargaSetelahDiskon = totalharga - (totalharga * diskon);

        System.out.println("jumlah tiket" + jumlahTiket);
        System.out.println("harga per tiket: Rp" + hargaTiket);
        System.out.println("diskon: " + (diskon * 100) + "%");
        System.out.println("total yang harus dibayar: Rp " + hargaSetelahDiskon);

        sc.close();
    }
}
