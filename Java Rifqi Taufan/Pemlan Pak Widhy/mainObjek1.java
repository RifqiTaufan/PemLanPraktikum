import java.util.Scanner;
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
        
    }

    public double getJariJari() {
        return jariJari;
    }

    public double hitungLuas() {
        return Math.PI * Math.pow(jariJari, 2);
    }
}

class PersegiPanjang {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}

public class mainObjek1 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Masukkan jari-jari lingkaran kepala : ");
        double jari1 = input.nextDouble();
        Lingkaran kepala = new Lingkaran(jari1);

        System.out.print("Masukkan panjang badan : ");
        double panjang1 = input.nextDouble();
        System.out.print("Masukkan lebar badan : ");
        double lebar1 = input.nextDouble();
        PersegiPanjang badan = new PersegiPanjang(panjang1, lebar1);

        System.out.print("Masukkan panjang tangan kiri : ");
        double panjang2 = input.nextDouble();
        System.out.print("Masukkan lebar tangan kiri : ");
        double lebar2 = input.nextDouble();
        PersegiPanjang tanganKiri = new PersegiPanjang(panjang2, lebar2);

        System.out.print("Masukkan panjang tangan kanan : ");
        double panjang3 = input.nextDouble();
        System.out.print("Masukkan lebar tangan kanan : ");
        double lebar3 = input.nextDouble();
        PersegiPanjang tanganKanan = new PersegiPanjang(panjang3, lebar3);

        System.out.print("Masukkan jari-jari telapak tangan kiri : ");
        double jari2 = input.nextDouble();
        Lingkaran telapakTanganKiri = new Lingkaran(jari2);

        System.out.print("Masukkan jari-jari telapak tangan kanan : ");
        double jari3 = input.nextDouble();
        Lingkaran telapakTanganKanan = new Lingkaran(jari3);

        System.out.print("Masukkan panjang kaki kiri : ");
        double panjang4 = input.nextDouble();
        System.out.print("Masukkan lebar kaki kiri : ");
        double lebar4 = input.nextDouble();
        PersegiPanjang kakiKiri = new PersegiPanjang(panjang4, lebar4);

        System.out.print("Masukkan panjang kaki kanan : ");
        double panjang5 = input.nextDouble();
        System.out.print("Masukkan lebar kaki kanan : ");
        double lebar5 = input.nextDouble();
        PersegiPanjang kakiKanan = new PersegiPanjang(panjang5, lebar5);

        System.out.print("Masukkan jari-jari telapak kaki kiri : ");
        double jari4 = input.nextDouble();
        Lingkaran telapakKakiKiri = new Lingkaran(jari4);

        System.out.print("Masukkan jari-jari telapak kaki kanan : ");
        double jari5 = input.nextDouble();
        Lingkaran telapakKakiKanan = new Lingkaran(jari5);

        double totalLuas = kepala.hitungLuas() + badan.hitungLuas() + tanganKiri.hitungLuas() + tanganKanan.hitungLuas() 
        + telapakTanganKiri.hitungLuas() + telapakTanganKanan.hitungLuas() + kakiKiri.hitungLuas() + kakiKanan.hitungLuas()
        + telapakKakiKiri.hitungLuas() + telapakKakiKanan.hitungLuas();

        double tinggiBadan = kepala.getJariJari() + kepala.getJariJari() + badan.getLebar() + kakiKanan.getPanjang() 
        + telapakKakiKanan.getJariJari() + telapakKakiKanan.getJariJari();
        
        System.out.println();
        System.out.printf("Total luas robot adalah   : %.2f cm2\n", totalLuas);
        System.out.printf("Tinggi badan robot adalah : %.0f cm\n", tinggiBadan);
    }
}
