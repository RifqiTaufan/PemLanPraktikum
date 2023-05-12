public class Jaket {
    private final int jaketA, jaketB, jaketC;
    private int totalHarga;

    public Jaket(int jaketA, int jaketB, int jaketC) {
        this.jaketA = jaketA;
        this.jaketB = jaketB;
        this.jaketC = jaketC;
    }

    public int getJaketA() {
        return jaketA;
    }

    public int getJaketB() {
        return jaketB;
    }

    public int getJaketC() {
        return jaketC;
    }

    public void Transaksi(int jumlah, int pilihan) {
        switch (pilihan) {
            case 1 : 
            totalHarga = getJaketA() * jumlah;
            System.out.println("Harga per satuan jaket A : Rp" + getJaketA() + ",00");
            System.out.println("Total harga dari " + jumlah + " jaket A adalah =\nRp" + totalHarga + ",00");
            break;

            case 2 :
            totalHarga = getJaketB() * jumlah;
            System.out.println("Harga per satuan jaket B : Rp" + getJaketB() + ",00");
            System.out.println("Total harga dari " + jumlah + " jaket B adalah =\nRp" + totalHarga + ",00");
            break;

            case 3 :
            totalHarga = getJaketC() * jumlah;
            System.out.println("Harga per satuan jaket C : Rp" + getJaketC() + ",00");
            System.out.println("Total harga dari " + jumlah + " jaket C adalah =\nRp" + totalHarga + ",00");
            break;
        }
    }
}