package latihan1;

/**
 * Mewakili bangun ruang Balok.
 * Kelas ini merupakan turunan dari BangunRuang dan
 * mengimplementasikan metode input serta perhitungan volume khusus untuk balok.
 */
public class Balok extends BangunRuang {

    /**
     * Meng-override metode input untuk menetapkan nilai
     * panjang dan lebar balok secara hardcoded.
     */
    @Override
    public void inputBangunRuang() {
        super.setPanjang(10);
        super.setLebar(5);
    }

    /**
     * Menghitung volume dari Balok.
     * Rumus: panjang * lebar (Tampaknya ada variabel tinggi yang hilang di sini).
     *
     * @param balok Objek BangunRuang yang akan diambil nilai panjang dan lebarnya.
     * @return Hasil perhitungan volume balok.
     */
    @Override
    public double hitungVolume(BangunRuang balok) {
        double volume;
        // Rumus balok
        volume = balok.getPanjang() * balok.getLebar() * balok.getTinggi();
        return volume;
    }
}