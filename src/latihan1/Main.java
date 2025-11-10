package latihan1;

/**
 * Kelas utama (Main) untuk menjalankan program perhitungan volume bangun ruang.
 * Kelas ini akan membuat objek dari Balok, Tabung, dan Bola,
 * memanggil metode input, dan menampilkan hasilnya.
 */
public class Main {

    /**
     * Metode utama (entry point) aplikasi.
     *
     * @param args Argumen baris perintah (tidak digunakan di program ini).
     */
    public static void main(String[] args) {

        // Membuat objek dan menghitung Balok
        BangunRuang balok = new Balok();
        balok.inputBangunRuang();
        System.out.println("TAMPIL VOLUME BALOK");
        System.out.println("Panjang Balok   = " + balok.getPanjang()); // getPanjang di Balok
        System.out.println("Lebar Balok     = " + balok.getLebar());   // getLebar di Balok
        System.out.println("Volume Balok    = " + balok.hitungVolume(balok));
        System.out.println("");

        // Membuat objek dan menghitung Tabung
        BangunRuang tabung = new Tabung();
        tabung.inputBangunRuang();
        System.out.println("TAMPIL VOLUME TABUNG");
        System.out.println("Jari-jari Tabung = " + tabung.getJariJari()); // getJariJari di Tabung
        System.out.println("Tinggi Tabung    = " + tabung.getTinggi());   // getTinggi di Tabung
        System.out.println("Volume Tabung    = " + tabung.hitungVolume(tabung));
        System.out.println("");

        // Membuat objek dan menghitung Bola
        BangunRuang bola = new Bola();
        bola.inputBangunRuang();
        System.out.println("TAMPIL VOLUME BOLA");
        System.out.println("Jari-jari Bola = " + bola.getJariJari()); // getJariJari di Bola
        System.out.println("Volume Bola    = " + bola.hitungVolume(bola));
        System.out.println("");
    }
}