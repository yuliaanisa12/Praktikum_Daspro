package Jobsheet08;

import java.util.Scanner;

public class NilaiKelompok27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double nilai = 0, totalNilai = 0, rataNilai = 0;
        double nilaiTertinggi = 0; 
        int kelompokTerbaik = 0;    

        for (int i = 1; i <= 6; i++) { 
            System.out.println("\nKelompok " + i);
            totalNilai = 0; 

           
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + " = ");
                
                if (sc.hasNextDouble()) {
                    nilai = sc.nextDouble();
                } else {
                    System.out.println("Input tidak valid. Nilai diatur ke 0.");
                    sc.next(); 
                    nilai = 0;
                }
                
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.printf("Rata-rata nilai kelompok %d = %.2f\n", i, rataNilai);
            
         
            if (rataNilai > nilaiTertinggi) {
                nilaiTertinggi = rataNilai;
                kelompokTerbaik = i;
            }
        }
        
        sc.close();
        

        System.out.println("HASIL AKHIR:");
        System.out.println("Kelompok dengan Rata-rata Nilai Tertinggi adalah: *Kelompok " + kelompokTerbaik + "*");
        System.out.printf("Dengan Rata-rata Nilai: \n", nilaiTertinggi);
    
    }
}
        
        
        