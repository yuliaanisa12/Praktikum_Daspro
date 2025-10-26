import java.util.Scanner;

public class Tugas1CekBilangan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka;

        System.out.println("--- Program Cek Bilangan Genap/Ganjil ---");
        System.out.print("Masukkan sebuah bilangan bulat: ");
        angka = input.nextInt();

        if (angka % 2 == 0) {

            System.out.println("Output: Genap");
        } else {

            System.out.println("Output: Ganjil");
        }

        input.close();
    }
}
