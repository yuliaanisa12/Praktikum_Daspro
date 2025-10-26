package jobsheet06;

import java.util.Scanner;

public class Latihan6BiayaListrik {
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

        System.out.println("Masukkan Daya Listrik (900/ 1300/ 2200/ 3500/ 5500 VA): ");
        daya = sc.nextInt();
        System.out.println("Masukkan pemakaian Listrik (KWH):");
        pemakaiankwh = sc.nextDouble();

        switch (daya) {
            case 900:
                tarif = 1300;
                break;
            case 1300:
            case 2200:
                tarif = 1500;
                break;
            case 3500:
            case 5500:
                tarif = 1700;
                break;
            default:
                System.out.println("Daya tidak valid!");
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
