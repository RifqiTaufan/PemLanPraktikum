public class bukuClass2 {
    private String judulBuku;
    private String penulisBuku;
    private String kategoriBuku;
    private String jumlahHalaman;
    private String tahunTerbit;

    // tambahan atribut sinopsis.
    private String sinopsisBuku;

    public bukuClass2() {

    }

    // constructor setiap atribut yang ada.
    public bukuClass2(String judulBuku, String penulisBuku, String kategoriBuku, String jumlahHalaman, String tahunTerbit, String sinopsisBuku) {
        this.judulBuku =judulBuku;
        this.penulisBuku = penulisBuku;
        this.kategoriBuku = kategoriBuku;
        this.jumlahHalaman = jumlahHalaman;
        this.tahunTerbit = tahunTerbit;
        this.sinopsisBuku = sinopsisBuku;
    }

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

    // tambahan method sinopsis.
    public void setSinopsisBuku(String sinopsisBuku) {
        this.sinopsisBuku = sinopsisBuku;
    }

    // method menghitung jumlah kata dari sinopsis.
    public int hitungJumlahKata(String sinopsis) {
        int jumlahKata = 0;
        boolean spasi = true;

        for (int i = 0; i < sinopsis.length(); i++) {
            if (sinopsis.charAt(i) == ' ') {
                spasi = true;
            } else {
                if (spasi) {
                    jumlahKata++;
                    spasi = false;
                }
            }
        }
        return jumlahKata;
    }

    public void tampilan() {
        System.out.println("=====BUKU KATEGORI " + this.kategoriBuku + "=====");
        System.out.println();
        System.out.println("Judul buku              = " + this.judulBuku);
        System.out.println("Penulis buku            = " + this.penulisBuku);
        System.out.println("Jumlah halaman buku     = " + this.jumlahHalaman);
        System.out.println("Tahun buku diterbitkan  = " + this.tahunTerbit);
        System.out.println("Sinopsis                = " + this.sinopsisBuku);
        System.out.println("Jumlah kata sinopsis    = " + hitungJumlahKata(sinopsisBuku));
        System.out.println();
    }

    public bukuClass2 bukuCopy() {
        bukuClass2 bukuBaru = new bukuClass2(this.judulBuku, this.penulisBuku, this.kategoriBuku, this.jumlahHalaman, this.tahunTerbit, this.sinopsisBuku);
        return bukuBaru;
    }

    // method untuk menentukan buku yang ingin dicopy.
    public int cariCopy(String judul, String[][] bukuAsli) {
        int hasil = 0;

        for (int i = 0; i <= 4; i++) {
            if (bukuAsli[i][0].equalsIgnoreCase(judul))
            return hasil = i;
        }
        return hasil;
    }
}
