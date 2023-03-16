public class bukuClass {
    private String judulBuku;
    private String penulisBuku;
    private String kategoriBuku;
    private String jumlahHalaman;
    private String tahunTerbit;

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }
    public void setPenulisBuku(String penulisBuku) {
        this.penulisBuku = penulisBuku;
    }
    public void setKategoriBuku(String kategoriBuku) {
        this.kategoriBuku = kategoriBuku;
    }
    public void setJumlahHalaman(String jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }
    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public void tampilan() {
        System.out.println("=====BUKU KATEGORI " + this.kategoriBuku + "=====");
        System.out.println();
        System.out.println("Judul buku              = " + this.judulBuku);
        System.out.println("Penulis buku            = " + this.penulisBuku);
        System.out.println("Jumlah halaman buku     = " + this.jumlahHalaman);
        System.out.println("Tahun buku diterbitkan  = " + this.tahunTerbit);
        System.out.println();
    }
}



