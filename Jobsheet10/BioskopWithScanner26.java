package Jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String [][] penonton = new String[4][2];

       
      
        while (true) {

            System.out.println("\n=== MENU ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.close();

            switch (menu) {

                case 1:
                    int baris, kolom;

                    
                    while (true) {
                        System.out.print("Masukkan baris (0-3): ");
                        baris = sc.nextInt();
                        if (baris >= 0 && baris < 4) break;
                        System.out.println("Baris tidak tersedia!");
                    }

                    
                    while (true) {
                        System.out.print("Masukkan kolom (0-1): ");
                        kolom = sc.nextInt();
                        if (kolom >= 0 && kolom < 2) break;
                        System.out.println("Kolom tidak tersedia!");
                    }

                    sc.nextLine(); 

                    
                    if (penonton[baris][kolom] != null) {
                        System.out.println("Kursi sudah ditempati oleh: " + penonton[baris][kolom]);
                        System.out.print("Ganti? (y/n): ");
                        String jawab = sc.nextLine();

                        if (!jawab.equalsIgnoreCase("y")) {
                            System.out.println("Penggantian dibatalkan.");
                            break;
                        }
                    }

                    
                    System.out.print("Masukkan nama: ");
                    penonton[baris][kolom] = sc.nextLine();

                    System.out.println("Data berhasil disimpan!");
                    break;

                case 2:
                    System.out.println("\n=== DAFTAR PENONTON ===");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.println("Kursi [" + i + "][" + j + "] = " + isi);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    return;

                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}


     
        

    

             
            

    

