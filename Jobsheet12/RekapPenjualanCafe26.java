package Jobsheet12;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RekapPenjualanCafe26 {
   
    String[] menuNames;
    int numDays;
    int[][] dataPenjualan;

    RekapPenjualanCafe26(String[] menuNames, int numDays, int[][] dataPenjualan) {
        this.menuNames = menuNames;
        this.numDays = numDays;
        this.dataPenjualan = dataPenjualan;
    }

  
    void tampilkanSeluruhData() {
        System.out.println("\n=== 📝 Seluruh Data Penjualan (" + numDays + " Hari) ===");
        
        System.out.printf("%-15s", "Menu");
        for (int j = 0; j < numDays; j++) {
            System.out.printf("%-8s", "H-" + (j + 1));
        }
        System.out.println();

        for (int i = 0; i < numDays * 8 + 15; i++) { 
             System.out.print("-");
        }
        System.out.println();
        
 
        for (int i = 0; i < dataPenjualan.length; i++) {
            System.out.printf("%-15s", menuNames[i]);
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                System.out.printf("%-8d", dataPenjualan[i][j]);
            }
            System.out.println();
        }
    }

    void tampilkanPenjualanTertinggi() {
        System.out.println("\n=== 👑 Menu dengan Total Penjualan Tertinggi ===");
        
        int totalPenjualanTertinggi = -1;
        String menuTerlaris = "";
        
        for (int i = 0; i < dataPenjualan.length; i++) {
            int total = 0;
           
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                total += dataPenjualan[i][j];
            }
            
            if (total > totalPenjualanTertinggi) {
                totalPenjualanTertinggi = total;
                menuTerlaris = menuNames[i];
            }
        }
        
        System.out.println("Menu Terlaris: **" + menuTerlaris + "**");
        System.out.println("Total Penjualan Selama " + numDays + " Hari: **" + totalPenjualanTertinggi + "**");
    }


     
    void tampilkanRataRataPenjualan() {
        System.out.println("\n=== 📈 Rata-rata Penjualan Selama " + numDays + " Hari ===");
        
        System.out.printf("%-15s | %s\n", "Menu", "Rata-rata");
        System.out.println("----------------|--------------------");
        
        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < dataPenjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                total += dataPenjualan[i][j];
            }
            
         
            double rataRata = (numDays > 0) ? (double) total / numDays : 0;
            
            System.out.printf("%-15s | %s\n", menuNames[i], df.format(rataRata));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("🚀 MEMULAI PROGRAM REKAP PENJUALAN CAFE (MODE DINAMIS) 🚀");
        
      
        System.out.print("Masukkan **jumlah menu** yang akan direkap: ");
        int numMenus = scanner.nextInt();
        System.out.print("Masukkan **jumlah hari** penjualan yang akan direkap: ");
        int numDays = scanner.nextInt();
        scanner.nextLine(); 

        String[] menuNames = new String[numMenus];
      
        int[][] dataPenjualan = new int[numMenus][numDays]; 
        
    
        System.out.println("\n--- Input Nama Menu ---");
        for (int i = 0; i < numMenus; i++) {
            System.out.print("Nama Menu ke-" + (i + 1) + ": ");
            menuNames[i] = scanner.nextLine();
        }
        
        System.out.println("\n--- Input Data Penjualan (per Hari) ---");
        for (int i = 0; i < numMenus; i++) {
            System.out.println("** Input Penjualan " + menuNames[i] + " **");
            for (int j = 0; j < numDays; j++) {
                System.out.print("  Penjualan Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = scanner.nextInt();
            }
        }
    
        RekapPenjualanCafe26 rekapCafe = new RekapPenjualanCafe26(menuNames, numDays, dataPenjualan);

        rekapCafe.tampilkanSeluruhData();
        rekapCafe.tampilkanPenjualanTertinggi();
        rekapCafe.tampilkanRataRataPenjualan();
        
        scanner.close();
    }
}

