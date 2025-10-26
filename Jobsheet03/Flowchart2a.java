import java.util.Scanner;

public class Flowchart2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Buat variabel
        int biayaSewa = 300000;
        int biayaSupir = 200000;
        int biayaBahanBakar = 1000;
        int lamaSewa;
        int jarakTempuh;
        int totalBiaya;

        // Perintah untuk menginput
        lamaSewa = sc.nextInt();

        System.out.println("jarak tempuh (per KM):");
        jarakTempuh = sc.nextInt();

        biayaSewa = 300000 * lamaSewa;
        biayaSupir = 200000 * lamaSewa;
        biayaBahanBakar = 1000 * jarakTempuh;
        totalBiaya = biayaSewa + biayaSupir + biayaBahanBakar;

        System.out.println("total Biaya sewa mobil = " + totalBiaya);
        sc.close();
    }
}