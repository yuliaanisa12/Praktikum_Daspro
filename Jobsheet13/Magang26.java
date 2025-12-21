package Jobsheet13;

import java.util.Scanner;

public class Magang26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array untuk menyimpan data
        String[] nama = new String[100];
        String[] nim = new String[100];
        String[] prodi = new String[100];
        String[] perusahaan = new String[100];
        int[] semester = new int[100];
        String[] status = new String[100];

        int jumlah = 0;
        int pilihan;

        do {
            System.out.println("\n=== SISTEM PENDAFTARAN MAGANG MAHASISWA ===");
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Data");
            System.out.println("3. Cari Data Berdasarkan Program Studi");
            System.out.println("4. Hitung Jumlah Status Magang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                // a) Tambah data magang
                case 1:
                    System.out.print("Nama Mahasiswa: ");
                    nama[jumlah] = sc.nextLine();

                    System.out.print("NIM: ");
                    nim[jumlah] = sc.nextLine();

                    System.out.print("Program Studi: ");
                    prodi[jumlah] = sc.nextLine();

                    System.out.print("Perusahaan Tujuan Magang: ");
                    perusahaan[jumlah] = sc.nextLine();

                    // Validasi semester
                    while (true) {
                        System.out.print("Semester (6 atau 7): ");
                        semester[jumlah] = sc.nextInt();
                        sc.nextLine();
                        if (semester[jumlah] == 6 || semester[jumlah] == 7) {
                            break;
                        }
                        System.out.println("Semester hanya boleh 6 atau 7!");
                    }

                    // Validasi status
                    while (true) {
                        System.out.print("Status (Diterima/Menunggu/Ditolak): ");
                        status[jumlah] = sc.nextLine();
                        if (status[jumlah].equalsIgnoreCase("Diterima")
                                || status[jumlah].equalsIgnoreCase("Menunggu")
                                || status[jumlah].equalsIgnoreCase("Ditolak")) {
                            break;
                        }
                        System.out.println("Status tidak valid!");
                    }

                    jumlah++;
                    System.out.println("Data magang berhasil ditambahkan!");
                    break;

                // b) Tampilkan semua data
                case 2:
                    if (jumlah == 0) {
                        System.out.println("Belum ada data magang!");
                        break;
                    }

                    System.out.println("\nDAFTAR PENDAFTAR MAGANG");
                    System.out.printf("%-5s %-15s %-10s %-15s %-20s %-10s %-10s\n",
                            "No", "Nama", "NIM", "Prodi", "Perusahaan", "Semester", "Status");

                    for (int i = 0; i < jumlah; i++) {
                        System.out.printf("%-5d %-15s %-10s %-15s %-20s %-10d %-10s\n",
                                (i + 1), nama[i], nim[i], prodi[i],
                                perusahaan[i], semester[i], status[i]);
                    }
                    break;

                // c) Cari berdasarkan program studi
                case 3:
                    System.out.print("Masukkan Program Studi: ");
                    String cariProdi = sc.nextLine();
                    boolean ditemukan = false;

                    for (int i = 0; i < jumlah; i++) {
                        if (prodi[i].equalsIgnoreCase(cariProdi)) {
                            System.out.println(nama[i] + " | " + nim[i] + " | " + status[i]);
                            ditemukan = true;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;

                // d) Hitung jumlah status magang
                case 4:
                    int diterima = 0, menunggu = 0, ditolak = 0;

                    for (int i = 0; i < jumlah; i++) {
                        if (status[i].equalsIgnoreCase("Diterima"))
                            diterima++;
                        else if (status[i].equalsIgnoreCase("Menunggu"))
                            menunggu++;
                        else if (status[i].equalsIgnoreCase("Ditolak"))
                            ditolak++;
                    }

                    System.out.println("\nJumlah Pendaftar Berdasarkan Status:");
                    System.out.println("Diterima : " + diterima);
                    System.out.println("Menunggu : " + menunggu);
                    System.out.println("Ditolak  : " + ditolak);
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }

        } while (pilihan != 0);
    }
}




