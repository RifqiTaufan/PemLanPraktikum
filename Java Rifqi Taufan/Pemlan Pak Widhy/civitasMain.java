import java.util.Scanner;
public class civitasMain {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("1. Mahasiswa ");
            System.out.println("2. Dosen ");
            System.out.println("3. Tendik ");
            System.out.print("Pilih 1 untuk melihat informasi masing-masing : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1 : 
                Mahasiswa mahasiswa1 = new Mahasiswa("Rahmad Hidayat", 20, "Jalan Bunga Kencang No. 20, Tangerang", "2251234", "Ilmu Ekonomi", "Gunadarma", "Ekonomi dan Bisnis", 2022);
                mahasiswa1.infoMahasiswa();
                System.out.println();

                Mahasiswa mahasiswa2 = new Mahasiswa("Faiza Nobara", 22, "Jalan Buaran No. 56, Jakarta Timur", "2255678", "Manajemen", "Gunadarma", "Ekonomi dan Bisnis", 2022);
                mahasiswa2.infoMahasiswa();
                System.out.println();
                break;

                case 2 :
                Dosen dosen1 = new Dosen("Tantyo Aditya", 40, "Jalan Tanjung Gede No. 5, Kebon Jeruk, Jakarta Barat", "2831046", "Bisnis Dasar", "S.E.");
                dosen1.infoDosen();
                System.out.println();

                Dosen dosen2 = new Dosen("Adi Syofian Asyauri", 29, "Jalan Pasar Minggu No. 48, Jakarta Barat", "1809237", "Patch Murni", "S.E.");
                dosen2.infoDosen();
                System.out.println();
                break;

                case 3 :
                Tendik tendik1 = new Tendik("Muhammad Julian", 27, "Jalan Senen Raya No. 12, Jakarta Pusat", "3280417", "Manager", "Akademik");
                tendik1.infoTendik();
                System.out.println();

                Tendik tendik2 = new Tendik("Calvin", 23, "Jalan Sudirman No. 280, Jakarta Pusat", "4340412", "Ketua Divisi", "Komunikasi");
                tendik2.infoTendik();
                System.out.println();
                break;
            }
        }
        while (pilihan >= 1 && pilihan <= 3);
        System.out.println("TIDAK ADA DI PILIHAN");
    }
}
