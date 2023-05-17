import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean JenisKelamin, String NIK, boolean menikah, double gaji, int jumlahAnak, int tahun, int bulan, int tanggal) {
        super(nama, JenisKelamin, NIK, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        double bonus = 0;
        int lamaBekerja = LocalDate.now().getYear() - this.tahunMasuk.getYear();

        if (lamaBekerja >= 0 && lamaBekerja <= 5) {
            bonus = gaji * 0.05;
        } else if (lamaBekerja > 5 && lamaBekerja <= 10) {
            bonus = gaji * 0.10;
        } else if (lamaBekerja > 10) {
            bonus = gaji * 0.15;
        }
        return bonus;
    }
    
    public double getTunjangan() {
        return super.getTunjangan() + (20 * jumlahAnak);
    }

    public double getPendapatan() {
        return super.getPendapatan() + getGaji() + getBonus();
    }

    public String toString() {
        return (super.toString() + "\nTahun masuk\t  : " + this.tahunMasuk + "\nJumlah anak\t  : " + this.jumlahAnak + "\nGaji\t\t  : " + this.gaji);
    }
}
