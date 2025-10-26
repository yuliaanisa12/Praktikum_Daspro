import java.util.Scanner;

public class Flowchart2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Buat variabel
        int jumlahTim = 3;
        int jumlahPeserta;
        int totalAnggaran;
        int biayaKonsumsi;
        int biayaHonorarium;
        int biayaPendaftaran;
        double sponsorship;
        double danaPolinema;
        double sisaBiaya;

        // perintah untuk menginput
        System.out.println("x: " + "Jumlah Tim :");
        jumlahTim = sc.nextInt();

        jumlahPeserta = jumlahTim * 3 + 25000;
        biayaKonsumsi = jumlahTim * 75000;
        biayaHonorarium = jumlahTim * 50000;
        totalAnggaran = 300000 + 500000 + 4000000 + 500000 + biayaKonsumsi + biayaHonorarium;
        danaPolinema = totalAnggaran * 0.6;
        sisaBiaya = totalAnggaran - danaPolinema;
        biayaPendaftaran = jumlahTim * 6000;
        sponsorship = sisaBiaya - biayaPendaftaran;

        System.out.println("Total Anggaran = " + totalAnggaran);
        System.out.println("Jumlah Peserta = " + jumlahPeserta);
        System.out.println("biaya Konsumsi = " + biayaKonsumsi);
        System.out.println("Biaya Honorarium = " + biayaHonorarium);
        System.out.println("Total Anggaran = " + totalAnggaran);
        System.out.println("Dana Polinema = " + danaPolinema);
        System.out.println("sisa biaya = " + sisaBiaya);
        System.out.println("biaya pendaftaran = " + biayaPendaftaran);
        System.out.println("sponsorship = " + sponsorship);
        sc.close();
    }
}
