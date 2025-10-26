package jobsheet06;

import java.util.Scanner;

public class Latihan9CetakBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah halaman buku: ");
        int jumlahHalaman = sc.nextInt();

        // Input
        System.out.print("Jenis cover (hard cover/soft cover): ");
        sc.nextLine(); // Membersihkan buffer
        String jenisCover = sc.nextLine().trim().toLowerCase();
        System.out.print("Kota pengiriman: ");
        String kota = sc.nextLine().trim().toLowerCase();

        // variabel
        int biayaPerHalaman = 200;
        int biayaCetak = jumlahHalaman * biayaPerHalaman;
        int biayaCover = 0;
        int beratCover = 0;

        if (jenisCover.equals("hard cover")) {
            biayaCover = 20000;
            beratCover = 250;
        } else if (jenisCover.equals("soft cover")) {
            biayaCover = 10000;
            beratCover = 100;
        }

        int biayaPacking = 300;
        int beratIsi = (jumlahHalaman / 2) * 3;
        int totalBerat = beratCover + biayaPacking + beratIsi;
        double totalBeratKg = Math.ceil(totalBerat / 1000.0);
        int biayaPengiriman = 15000 * (int) totalBeratKg;

        if (kota.equals("malang") || kota.equals("batu")) {
            biayaPengiriman = 20000;
        }

        int totalBiaya = biayaCetak + biayaCover + biayaPacking + biayaPengiriman;

        System.out.println("Biaya Cetak: Rp " + biayaCetak);
        System.out.println("Biaya Cover: Rp " + biayaCover);
        System.out.println("Biaya Packing: Rp " + biayaPacking);
        System.out.println("Biaya Pengiriman: Rp " + biayaPengiriman);
        System.out.println("Total Biaya: Rp " + totalBiaya);

        sc.close();
    }

}
