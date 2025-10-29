package Jobsheet07;

import java.util.Scanner;

public class SiakadFor27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("test");

        // variabel
        double nilai;
        double tertinggi = 0;
        double terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.println("masukkan nilai makasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("nilai tertinggi:" + tertinggi);
        System.out.println("nilai terendah: " + terendah);
        sc.close();
    }
}
