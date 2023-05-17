public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, String nama, boolean JenisKelamin, String NIK, boolean menikah, double gaji, int jumlahAnak,int tahun, int bulan, int tanggal) {
        super(nama, JenisKelamin, NIK, menikah, gaji, jumlahAnak, tahun, bulan, tanggal);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public double getTunjangan() {
        return super.getTunjangan() + (0.10 * getGaji());
    }

    public String toString() {
        return (super.toString() + "\nDepartemen\t  : " + this.departemen);
    }
}
