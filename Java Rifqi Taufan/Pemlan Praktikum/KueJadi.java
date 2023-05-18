public class KueJadi extends Kue {
    public double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public double hitungHarga() {
        return super.getHarga() * this.jumlah * 2;
    }
    
    public String toString() {
        return super.toString() + System.out.printf("%-12s: %.0f kue\n", "Jumlah Kue", jumlah);
    }
}
