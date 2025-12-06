package Jobsheet12;

public class PengunjungCafe26 {
    public class PengunjungCafeNoAbsen {

    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("\nDaftar Nama Pengunjung:");
        
        // Modifikasi: Menggunakan for-each loop (enhanced for loop)
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {
        
        daftarPengunjung("Ali", "Budi", "Citra");

        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");

        daftarPengunjung(); 
        
        daftarPengunjung("ica");
    }
}
    
}
