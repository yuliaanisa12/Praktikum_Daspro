package Jobsheet10;

import java.util.Scanner;

public class TugasSurvey26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int responden = 10;
        int pertanyaan = 6;

        int[][] survey = new int[responden][pertanyaan];

        System.out.println("=== INPUT DATA SURVEI KEPUASAN ===");

        // a. hasil survei
        for (int i = 0; i < responden; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < pertanyaan; j++) {
                while (true) {
                    System.out.print("Nilai pertanyaan " + (j + 1) + " (1-5): ");
                    int nilai = sc.nextInt();
                    if (nilai >= 1 && nilai <= 5) {
                        survey[i][j] = nilai;
                        break;
                    }
                    System.out.println("Input tidak valid. Harus 1-5.");
                }
            }
        }

        // b. Rata-rata responden
        System.out.println("\n=== RATA-RATA PER RESPONDEN ===");
        for (int i = 0; i < responden; i++) {
            int total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += survey[i][j];
            }
            double rata = (double) total / pertanyaan;
            System.out.println("Rata-rata responden " + (i + 1) + ": " + rata);
        }

        // c. Rata-rata pertanyaan
        System.out.println("\n=== RATA-RATA PER PERTANYAAN ===");
        for (int j = 0; j < pertanyaan; j++) {
            int total = 0;
            for (int i = 0; i < responden; i++) {
                total += survey[i][j];
            }
            double rata = (double) total / responden;
            System.out.println("Rata-rata pertanyaan " + (j + 1) + ": " + rata);
        }

        // d. Rata-rata keseluruhan
        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        int totalSemua = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalSemua += survey[i][j];
            }
        }

        double rataKeseluruhan = (double) totalSemua / (responden * pertanyaan);
        System.out.println("Rata-rata keseluruhan: " + rataKeseluruhan);
    sc.close();
    }
}

