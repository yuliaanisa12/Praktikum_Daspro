package Jobsheet12;

import  java.util.Scanner;

public class Kafe26 {
     public static int hitungTotalHarga(int totalHarga, String kodePromo) {
        if (kodePromo.equalsIgnoreCase("DISKON50")){
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%");
            return totalHarga - (totalHarga * 50 / 100);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 30%");
            return totalHarga - (totalHarga * 30 / 100);
        } else if (!kodePromo.equalsIgnoreCase("none")) {
            System.out.println("Kode promo tidak valid");
        }

        return totalHarga;
    }

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp15.000");
        System.out.println("2. Cappucino - Rp20.000");
        System.out.println("3. Latte - Rp22.000");
        System.out.println("4. Teh Tarik - Rp12.000");
        System.out.println("5. Roti Bakar - Rp10.000");
        System.out.println("6. Mie Goreng - Rp18.000");
        System.out.println("========================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        Menu("Andi", true);

        int totalSemuaPesanan = 0;
        String lanjut;

        do {
            System.out.println("Masukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.println("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItems = sc.nextInt();

            int total = hargaItems[pilihanMenu - 1] * banyakItems;
            System.out.println("Total harga untuk menu ini: Rp " + total);

            totalSemuaPesanan += total;

            System.out.println("Apakah ingin memesan menu lain? (ya/tidak): ");
            lanjut = sc.next();

        } while (lanjut.equalsIgnoreCase("ya"));

        System.out.println("Total keseluruhan sebelum promo: Rp " + totalSemuaPesanan);
        System.out.println("Masukkan kode promo (DISKON50 / DISKON30 / none): ");
        String kodePromo = sc.next();

        int totalAkhir = hitungTotalHarga(totalSemuaPesanan, kodePromo);
        System.out.println("Total akhir setelah promo: Rp " + totalAkhir);
    }
}





    

