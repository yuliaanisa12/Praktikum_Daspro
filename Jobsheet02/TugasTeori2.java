public class TugasTeori2 {
    public static void main(String[] args) {
        // Input data
        int panjang_tanah = 100;
        int lebar_tanah = 50;
        int diameter_kolam = 2;
        int sisi_kolam =2;
        double phi = 3.14;
        
        // Proses perhitungan
        int luas_tanah = panjang_tanah * lebar_tanah;
        double jari_jari = diameter_kolam / 2.0;
        double luas_lingkaran = phi * jari_jari * jari_jari; 
        double luas_2_lingkaran = 2 * luas_lingkaran;
        int luas_persegi = sisi_kolam * sisi_kolam;
        double luas_kolam = luas_2_lingkaran + luas_persegi;
        double luas_rumput = luas_tanah - luas_kolam;
        
        // Output hasil
        System.out.println("Luas tanah total        : " + luas_tanah + "m²");
        System.out.println("Luas 2 kolam lingkaran  : " + luas_2_lingkaran + "m²");
        System.out.println("Luas kolam persegi      : " + luas_persegi + "m²");
        System.out.println("Total luas              : " + luas_kolam + "m²");
        System.out.println("Luas rumput taman       : " + luas_rumput  + "m²");
        

    }
}
