package Jobsheet08;

import java.util.Scanner;

public class Tugas1JumlahKuadrat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan nilai n (1-5): ");
        int n = sc.nextInt();

        int jumlahKuadrat = 0;

        for (int i =1; i <= n; i++) {
            jumlahKuadrat = 0;
            System.out.print("n = " + i + " = jumlah kuadrat =");

            for ( int j = 1; j <= i; j++) {
                jumlahKuadrat += (j * j);
                System.out.print(j * j);      
                if (j < i) System.out.print(" + ");     
            }
            System.out.println(" = "+ jumlahKuadrat);
        }
        sc.close();
    }
}
