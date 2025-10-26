package jobsheet06;

import java.util.Scanner;

public class Latihan7HMTI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Tim: ");
        int jumlahTim = sc.nextInt();

        // Variabel
        int jumlahPeserta = jumlahTim * 3 + 25000;
        int biayaKonsumsi = jumlahTim * 75000;
        int biayaHonorarium = jumlahTim * 50000;
        int biayaPendaftaran = jumlahTim * 6000;
        int totalAnggaran = 300000 + 500000 + 4000000 + 500000 + biayaKonsumsi + biayaHonorarium;

        // input ditanya
        System.out.println("Apakah Polinema memberikan dana bantuan? (ya/tidak): ");
        sc.nextLine();
        String jawaban = sc.nextLine().trim().toLowerCase();

        double danaPolinema = 0;
        if (jawaban.equals("ya")) {
            System.out.println("Berapa persen daya batuan dari pilonema? : ");
            double persen = sc.nextDouble();
            danaPolinema = totalAnggaran * persen;
        }
        double sisaBiaya = totalAnggaran - danaPolinema - biayaPendaftaran;
        double sponsorship = sisaBiaya;

        System.out.println("Jumlah peserta: " + jumlahPeserta);
        System.out.println("Biaya Konsumsi: Rp " + biayaKonsumsi);
        System.out.println("Biaya Honorarium: Rp " + biayaHonorarium);
        System.out.println("Biaya Pendaftaran: Rp " + biayaPendaftaran);
        System.out.println("Total Anggaran: Rp " + totalAnggaran);
        System.out.println("Dana Polinema: Rp " + danaPolinema);
        System.out.println("Sisa Biaya: Rp " + sisaBiaya);
        System.out.println("Sponsorship: Rp " + sponsorship);

        sc.close();

    }
}
