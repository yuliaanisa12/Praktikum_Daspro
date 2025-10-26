package jobsheet06;

import java.util.Scanner;

public class Latihan5BiayaListrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variabel
        int daya;
        double pemakaiankwh;
        double biayaTetap = 50000;
        double tarif;
        double totalSebelumPajak;
        double PPN;
        double totalBayar;

        // input
        System.out.println("Masukkan Daya Listrik (VA): ");
        daya = sc.nextInt();
        System.out.println("Masukkan pemakaian Listrik (KWH):");
        pemakaiankwh = sc.nextDouble();

        biayaTetap = 50000;

        if (daya == 900) {
            tarif = 1300;
        } else if (daya == 1300 || daya == 2200) {
            tarif = 1500;
        } else if (daya == 3500 || daya == 5500) {
            tarif = 1700;
        } else {
            System.out.println("daya tidak valid!");
            sc.close();
            return;
        }
        totalSebelumPajak = biayaTetap + (pemakaiankwh * tarif);
        PPN = 0.10 * totalSebelumPajak;
        totalBayar = totalSebelumPajak + PPN;

        System.out.println("daya listrik : " + daya + "VA");
        System.out.println("Pemakaian listrik   : " + pemakaiankwh + " kWh");
        System.out.println("Tarif per kWh       : Rp " + tarif);
        System.out.println("Biaya tetap         : Rp " + biayaTetap);
        System.out.println("Total sebelum pajak : Rp " + totalBayar);
        System.out.println("PPN 10%             : Rp " + PPN);
        System.out.println("Total bayar         : Rp " + totalBayar);

        sc.close();
    }

}
