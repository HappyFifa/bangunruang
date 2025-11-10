package latihan1;

/**
 * Kelas induk (parent class) yang merepresentasikan konsep umum dari sebuah bangun ruang.
 * Menyimpan atribut-atribut umum (panjang, lebar, jari-jari, tinggi, PHI)
 * dan metode dasar yang dapat digunakan atau di-override oleh kelas turunannya.
 */
public class BangunRuang {

    private double panjang;
    private double lebar;
    private double jariJari;
    private double tinggi;
    /**
     * Konstanta untuk nilai Pi (3.14).
     */
    protected double PHI = 3.14;

    /**
     * Mendapatkan nilai panjang.
     *
     * @return Nilai panjang.
     */
    public double getPanjang() {
        return panjang;
    }

    /**
     * Menetapkan nilai panjang.
     *
     * @param panjang Nilai panjang yang baru.
     */
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    /**
     * Mendapatkan nilai lebar.
     *
     * @return Nilai lebar.
     */
    public double getLebar() {
        return lebar;
    }

    /**
     * Menetapkan nilai lebar.
     *
     * @param lebar Nilai lebar yang baru.
     */
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    /**
     * Mendapatkan nilai jari-jari.
     *
     * @return Nilai jari-jari.
     */
    public double getJariJari() {
        return jariJari;
    }

    /**
     * Menetapkan nilai jari-jari.
     *
     * @param jariJari Nilai jari-jari yang baru.
     */
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    /**
     * Mendapatkan nilai tinggi.
     *
     * @return Nilai tinggi.
     */
    public double getTingg() { // Nama metode Anda adalah getTingg()
        return tinggi;
    }

    /**
     * Menetapkan nilai tinggi.
     *
     * @param tinggi Nilai tinggi yang baru.
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * Metode dasar untuk input data bangun ruang.
     * Metode ini akan di-override oleh kelas turunan.
     */
    public void inputBangunRuang() {
        System.out.println("Masukan Data Bangun Ruang");
    }

    /**
     * Metode dasar untuk menghitung volume.
     * Akan di-override oleh kelas turunan dengan rumus spesifik.
     *
     * @param bgnRuang Objek bangun ruang (tidak terpakai di sini).
     * @return Nilai volume dasar (selalu 0 di kelas induk ini).
     */
    public double hitungVolume(BangunRuang bgnRuang) {
        return 0; // Nilai default untuk kelas induk
    }
}