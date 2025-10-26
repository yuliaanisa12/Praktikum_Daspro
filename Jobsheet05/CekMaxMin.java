import java.util.Scanner;

public class CekMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        int max, min;

        System.out.println("--- Program Cek Bilangan Maksimum dan Minimum ---");
        System.out.print("Masukkan bilangan pertama (A): ");
        a = input.nextInt();
        System.out.print("Masukkan bilangan kedua (B): ");
        b = input.nextInt();
        System.out.print("Masukkan bilangan ketiga (C): ");
        c = input.nextInt();

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }

        System.out.println("\nBilangan Maksimum adalah: " + max);
        System.out.println("Bilangan Minimum adalah: " + min);

        input.close();
    }
}