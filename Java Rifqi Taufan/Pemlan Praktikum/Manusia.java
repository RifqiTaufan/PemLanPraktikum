public class Manusia {
    private String nama;
    private boolean JenisKelamin;
    private String NIK;
    private boolean menikah;

    public Manusia(String nama, boolean JenisKelamin, String NIK, boolean menikah) {
        this.nama = nama;
        this.JenisKelamin = JenisKelamin;
        this.NIK = NIK;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(boolean JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return JenisKelamin == true ? "Laki-laki" : "Perempuan";
    }

    public String getNIK() {
        return NIK;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public double getTunjangan() {
        double tunjangan = 0;
        if (menikah == true) {
            if (JenisKelamin == true) {
                tunjangan = 25;
            } else {
                tunjangan = 20;
            }
        } else {
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return ("Nama\t\t  : " + getNama() + "\nNIK\t\t  : " + getNIK() + "\nJenis kelamin\t  : " + getJenisKelamin() + "\nJumlah pendapatan : "
                + getPendapatan() + " $");
    }
}
