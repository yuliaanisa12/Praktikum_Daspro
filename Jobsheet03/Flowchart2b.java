import java.util.Scanner;

public class Flowchart2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // buat variabel
        int tariflistrik = 1500;
        int biayaBulanan;
        int dayalistrik;
        double PPN = 0.1;
        double diskon;
        double totalBiaya;

        // Perintah untuk menginput
        System.out.println("dayalistrik(per KWH):");
        dayalistrik = sc.nextInt();

        tariflistrik = 1500 * dayalistrik;
        biayaBulanan = 50000 + tariflistrik;
        diskon = PPN * biayaBulanan;
        totalBiaya = dayalistrik + biayaBulanan;

        System.out.println("total biaya listrik = " + totalBiaya);
        sc.close();
    }
}
