package Jobsheet10;

import java.util.Scanner;

public class SIAKAD26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("input nilai mahasiswa ke-" + (i+1));
           
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("nilai mata kuliah ke-" + (j+1)+ ": ");
                nilai[i][j] = sc.nextInt();
            
            }
            System.out.println();
        }
        System.out.println("=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }
}
        


