public class civitasClass {
    protected String nama;
    protected int usia;
    protected String alamat;
    
    public civitasClass(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setUsia(int usia) {
        this.usia = usia;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

class Mahasiswa extends civitasClass {
    private String NIM;
    private String jurusan;
    private String universitas;
    private String fakultas;
    private int angkatan;
    
    public Mahasiswa(String nama, int usia, String alamat, String NIM, String jurusan, String universitas, String fakultas, int angkatan) {
        super(nama, usia, alamat);
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.universitas = universitas;
        this.fakultas = fakultas;
        this.angkatan = angkatan;
    }

    public void infoMahasiswa() {
        System.out.println("Nama Mahasiswa  = " + this.nama);
        System.out.println("Usia            = " + this.usia);
        System.out.println("Alamat          = " + this.alamat);
        System.out.println("NIM             = " + this.NIM);
        System.out.println("Universitas     = " + this.universitas);
        System.out.println("Fakultas        = " + this.fakultas);
        System.out.println("Jurusan         = " + this.jurusan);
        System.out.println("Angkatan        = " + this.angkatan);
    }
}

class Dosen extends civitasClass {
    private String NIDN;
    private String matkul;
    private String gelar;

    public Dosen(String nama, int usia, String alamat, String NIDN, String matkul, String gelar) {
        super(nama, usia, alamat);
        this.NIDN = NIDN;
        this.matkul = matkul;
        this.gelar = gelar;
    }

    public void infoDosen() {
        System.out.println("Nama Dosen      = " + this.nama + ", " + this.gelar);
        System.out.println("Usia            = " + this.usia);
        System.out.println("Alamat          = " + this.alamat);
        System.out.println("NIDN            = " + this.NIDN);
        System.out.println("Mata Kuliah     = " + this.matkul);
    }
}

class Tendik extends civitasClass {
    private String NIP;
    private String jabatan;
    private String bagian;
    
    public Tendik(String nama, int usia, String alamat, String NIP, String jabatan, String bagian) {
        super(nama, usia, alamat);
        this.NIP = NIP;
        this.jabatan = jabatan;
        this.bagian = bagian;
    }

    public void infoTendik() {
        System.out.println("Nama Tendik = " + this.nama);
        System.out.println("Usia        = " + this.usia);
        System.out.println("Alamat      = " + this.alamat);
        System.out.println("NIP         = " + this.NIP);
        System.out.println("Jabatan     = " + this.jabatan);
        System.out.println("Bagian      = " + this.bagian);
    }
}
