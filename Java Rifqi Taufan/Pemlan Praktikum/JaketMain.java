import java.util.Scanner;
public class JaketMain {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Jaket harga = new Jaket(100000, 125000, 175000);
        Jaket diskon = new Jaket(95000, 120000, 160000);

        System.out.println("1. Jaket A");
        System.out.println("2. Jaket B");
        System.out.println("3. Jaket C");
        System.out.print("Masukkan pilihan : ");
        int pilihan = input.nextInt();
        if (!(pilihan >= 1 && pilihan <= 3)) {
            System.out.println("ERROR! pilih angka yang ada.");
        } else {
            System.out.print("Masukkan jumlah jaket : ");
            int jumlah = input.nextInt();
            if (jumlah > 100) {
                diskon.Transaksi(jumlah, pilihan);
            } else {
                harga.Transaksi(jumlah, pilihan);
            }
        }
    }
}