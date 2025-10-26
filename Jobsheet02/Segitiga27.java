import java.util.Scanner;

public class Segitiga27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Buat variabel untuk alas dan tinggi
        int alas, tinggi;
        float luas;

        //Perintah untuk menginput alas dan tinggi
        System.out.print("Masukkan alas");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi");
        tinggi = sc.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga"+ luas);
        sc.close();
    }
}
