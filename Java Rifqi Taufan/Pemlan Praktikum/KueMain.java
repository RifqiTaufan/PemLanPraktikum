public class KueMain {
    public static void main(String[] args) {
        Kue[] daftarKue = { new KueJadi("Apem", 10000, 10), 
                            new KueJadi("Lumpur", 8000, 9),
                            new KueJadi("Bika Ambon", 20000, 15),    
                            new KueJadi("Croffle", 15000, 5),
                            new KueJadi("Cubit", 8000, 10),         
                            new KueJadi("Carabikang", 7000, 5),       
                            new KueJadi("Croissant", 20000, 7),                   
                            new KueJadi("Cheese tart", 9000, 20),                  
                            new KueJadi("Cookies", 15000, 6),             
                            new KueJadi("Kue Lapis", 10000, 3),                
                            new KuePesanan("Kue Coklat", 50000, 1.4),               
                            new KuePesanan("Cheese Cake", 150000, 1.2),                 
                            new KuePesanan("Brownies", 60000, 0.6),            
                            new KuePesanan("Sponge Cake", 70000, 1.3), 
                            new KuePesanan("Butter Cake", 40000, 1), 
                            new KuePesanan("Chiffon Cake", 45000, 1.5), 
                            new KuePesanan("Kue Tape", 100000, 2.1), 
                            new KuePesanan("Pound Cake", 80000, 1.7), 
                            new KuePesanan("Biscuit", 35000, 0.3), 
                            new KuePesanan("Souffle Pancake", 12500, 0.8)};

        System.out.println("====DAFTAR KUE====");

        for (Kue kue : daftarKue) {
            System.out.println(kue.toString());
            if (kue instanceof KuePesanan) {
                System.out.printf("%-12s: %s\n", "Jenis Kue", "Kue Pesanan");
                System.out.println();
            } else {
                System.out.printf("%-12s: %s\n", "Jenis Kue", "Kue Jadi");
                System.out.println();
            }
        }

        double totalHarga = 0;

        System.out.println("====TOTAL HARGA SEMUA KUE====");
        for (Kue kue : daftarKue) {
            totalHarga += kue.getHarga();
        }
        System.out.printf("Total harga semua kue : Rp%,5.2f\n", totalHarga);
        System.out.println();

        double totalHargaPesanan = 0;
        double totalBerat = 0;

        System.out.println("====TOTAL KUE PESANAN====");
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.getHarga();
                totalBerat += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.printf("Total harga kue pesanan : Rp%,5.2f\n", totalHargaPesanan);
        System.out.printf("Total berat kue pesanan : %.1f gram\n", totalBerat);
        System.out.println();

        double totalHargaJadi = 0;
        int jumlahKueJadi = 0;

        System.out.println("====TOTAL KUE JADI====");
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.getHarga();
                jumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.printf("Total harga kue jadi  : Rp%,5.2f\n", totalHargaJadi);
        System.out.printf("Total jumlah kue jadi : %d kue\n", jumlahKueJadi);
        System.out.println();

        double hargaTerbesar = 0;
        Kue kueTermahal = null;
        for (Kue kue : daftarKue) {
            if (kue.getHarga() > hargaTerbesar) {
                hargaTerbesar = kue.getHarga();
                kueTermahal = kue;
            }
        }
        System.out.println("Kue dengan harga termahal : ");
        System.out.println(kueTermahal.toString());
    }
}