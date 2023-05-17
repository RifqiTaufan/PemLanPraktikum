public class MahasiswaFILKOM extends Manusia {
    private String NIM;
    private double IPK;

    public MahasiswaFILKOM(String nama,boolean JenisKelamin, String NIK, boolean menikah, String NIM, double IPK) {
        super(nama, JenisKelamin, NIK, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNIM() {
        return NIM;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public double getIPK() {
        return IPK;
    }

    public String getStatus() {
        String angkatan = "20" + NIM.substring(0, 2);
        String prodi = "";

        if (getNIM().charAt(6) == '2') {
            prodi = "Teknik Informatika";
        } else if (getNIM().charAt(6) == '3') {
            prodi = "Teknik Komputer";
        } else if (getNIM().charAt(6) == '4') {
            prodi = "Sistem Informasi";
        } else if (getNIM().charAt(6) == '6') {
            prodi = "Pendidikan Teknologi Informasi";
        } else if (getNIM().charAt(6) == '7') {
            prodi = "Teknologi Informasi";
        }
        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        double beasiswa = 0;

        if (this.IPK >= 3.0 && this.IPK <= 3.5) {
            beasiswa = 50 + getPendapatan();
        } else if (this.IPK > 3.5 && this.IPK <= 4.0) {
            beasiswa = 75 + getPendapatan();
        }
        return beasiswa;
    }

    public String toString() {
        return ("Nama\t\t  : " + getNama() + "\nNIK\t\t  : " + getNIK() + "\nJenis kelamin\t  : " + getJenisKelamin() + "\nJumlah pendapatan : "
        + getBeasiswa() + " $" + "\nNIM\t\t  : " + getNIM() + "\nIPK\t\t  : " + getIPK() + "\nStatus\t\t  : " + getStatus());
    }
}
