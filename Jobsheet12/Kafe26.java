package Jobsheet12;

public class Kafe26 {

    public static void Menu(String namaPelanggan, boolean isMember, String KodePromo) {
        System.out.println("Selamat datang, "+ namaPelanggan + "!");
    
        if(isMember) {
            System.out.println("Anda adalah member, dapat diskon 10% untuk setiap pembelian!");
        }
        if(KodePromo.equals("DISKON50")) {
            System.out.println("kode promo valid! anda mendapatkan diskon 50%");
        } else if (KodePromo.equals("DISKON30")){
            System.out.println("kode promo valid! anda mendapatkan diskon30%");
        } else {
            System.out.println("kode promo invalid");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Kopi Hitam - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("==========================");
        System.out.println("Silakan pilih menu yang adnda inginkan");
    }
    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");
    }
}
    

