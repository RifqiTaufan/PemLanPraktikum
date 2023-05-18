public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public abstract double hitungHarga();

    public String toString() {
        return String.format("\t%-12s: %s\n\t%-12s: Rp%,5.2f\n", "Nama Kue", nama, "Harga Kue", getHarga());
    }
}
