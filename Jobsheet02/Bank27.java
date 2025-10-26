import java.util.Scanner;

public class Bank27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah tabungan awal dan lama menabung
        double tabunganAwal, tabunganAkhir, bunga, persentaseBunga;
        int lamaMenabung;

        // Inisialisasi persentase bunga
        persentaseBunga = 0.0002;

        System.out.print("Masukkan tabungan awal : ");
        tabunganAwal = input.nextDouble();
        System.out.print("Masukkan lama menabung (bulan): ");
        lamaMenabung = input.nextInt();
        bunga = persentaseBunga * lamaMenabung * tabunganAwal;
        tabunganAkhir = tabunganAwal + bunga;

        System.out.println("Bunga: " + bunga);
        System.out.println("Tabungan akhir: " + tabunganAkhir);

        // Menutup objek Scanner
        input.close();

    }
}
