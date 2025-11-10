package latihan1;

/**
 * Mewakili bangun ruang Bola.
 * Kelas ini merupakan turunan dari BangunRuang dan
 * mengimplementasikan metode input serta perhitungan volume khusus untuk bola.
 */
public class Bola extends BangunRuang {

    /**
     * Meng-override metode input untuk menetapkan nilai
     * jari-jari bola secara hardcoded.
     */
    @Override
    public void inputBangunRuang() {
        super.setJariJari(10);
    }

    /**
     * Menghitung volume dari Bola.
     * Rumus: (4 * PHI * r^3) / 3
     *
     * @param bola Objek BangunRuang yang akan diambil nilai jari-jarinya.
     * @return Hasil perhitungan volume bola.
     */
    @Override
    public double hitungVolume(BangunRuang bola) {
        double volume;
        volume = (4 * super.PHI * Math.pow(bola.getJariJari(), 3)) / 3;
        return volume;
    }
}