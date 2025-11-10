package latihan1;

/**
 * Mewakili bangun ruang Tabung.
 * Kelas ini merupakan turunan dari BangunRuang dan
 * mengimplementasikan metode input serta perhitungan volume khusus untuk tabung.
 */
public class Tabung extends BangunRuang {

    /**
     * Meng-override metode input untuk menetapkan nilai
     * jari-jari dan tinggi tabung secara hardcoded.
     */
    @Override
    public void inputBangunRuang() {
        super.setJariJari(10);
        super.setTinggi(8);
    }

    /**
     * Menghitung volume dari Tabung.
     * Rumus: PHI * r^2 * t
     *
     * @param tabung Objek BangunRuang yang akan diambil nilai jari-jari dan tingginya.
     * @return Hasil perhitungan volume tabung.
     */
    @Override
    public double hitungVolume(BangunRuang tabung) {
        double volume;
        volume = super.PHI * Math.pow(tabung.getJariJari(), 2) * tabung.getTingg();
        return volume;
    }
}