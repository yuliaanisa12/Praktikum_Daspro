package jobsheet06;

import java.util.Scanner;

public class Latihan8CetakBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variabel
        int halaman;
        int hargaCover;
        int beratCover;
        int biayaCetakPerHalaman = 200;
        int beratKertasPerLembar = 3;
        int beratPacking = 300;
        int biayaKirimPerKg = 15000;
        String jenisCover;

        // Input
        System.out.print("Masukkan jumlah halaman buku: ");
        halaman = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan jenis cover (hard/soft): ");
        jenisCover = sc.nextLine().toLowerCase();

        if (jenisCover.equals("hard")) {
            hargaCover = 20000;
            beratCover = 250;
        } else if (jenisCover.equals("soft")) {
            hargaCover = 10000;
            beratCover = 100;
        } else {
            System.out.println("Jenis cover tidak valid!");
            sc.close();
            return;
        }

        int biayaCetak = halaman * biayaCetakPerHalaman;
        int jumlahLembar = (halaman + 1) / 2;
        double beratBuku = jumlahLembar * beratKertasPerLembar + beratCover + beratPacking;
        int biayaKirim = (int) Math.ceil(beratBuku / 1000) * biayaKirimPerKg;
        int totalBiaya = biayaCetak + hargaCover + biayaKirim;

        // output
        System.out.println("\n--- Rincian Biaya ---");
        System.out.println("Biaya cetak: Rp " + biayaCetak);
        System.out.println("Biaya cover (" + jenisCover + "): Rp " + hargaCover);
        System.out.println("Biaya pengiriman: Rp " + biayaKirim);
        System.out.println("Total biaya yang harus dibayar: Rp " + totalBiaya);
        sc.close();
    }
}