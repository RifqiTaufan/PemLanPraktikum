class Mobil {
    protected String nomorPolisi;
    protected String tipe;
    protected int jumlahPenumpang;

    public Mobil(String nomorPolisi, String tipe, int jumlahPenumpang) {
        this.nomorPolisi = nomorPolisi;
        this.tipe = tipe;
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public String getTipe() {
        return tipe;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }
}

class Angkot extends Mobil {
    private DriverAngkot driverAngkot;
    private Penumpang[] daftarPenumpang;

    public Angkot(String nomorPolisi, String tipe, int jumlahPenumpang) {
        super(nomorPolisi, tipe, jumlahPenumpang);
        this.daftarPenumpang = new Penumpang[jumlahPenumpang];
    }

    public DriverAngkot getDriverAngkot() {
        return driverAngkot;
    }

    public void setDriverAngkot(DriverAngkot driverAngkot) {
        this.driverAngkot = driverAngkot;
    }

    public void naikPenumpang(Penumpang penumpang) {
        for (int i = 0; i < this.daftarPenumpang.length; i++) {
            if (this.daftarPenumpang[i] == null) {
                this.daftarPenumpang[i] = penumpang;
                break;
            }
        }
    }

    public void turunPenumpang(Penumpang penumpang) {
        for (int i = 0; i < daftarPenumpang.length; i++) {
            if (daftarPenumpang[i] != null && daftarPenumpang[i].getNama().equals(penumpang.getNama())) {
                daftarPenumpang[i] = null;
                break;
            }
        }
    }

    public void displayAngkot() {
        System.out.println("Nomor Polisi        : " + this.nomorPolisi);
        System.out.println("Tipe                : " + this.tipe);
        System.out.println("Jumlah penumpang    : " + this.jumlahPenumpang);
        System.out.println("Daftar penumpang  : ");
        for (int i = 0; i < jumlahPenumpang; i++) {
            if (daftarPenumpang[i] != null) {
            System.out.println((i + 1) + ". " + daftarPenumpang[i].getNama());
            }
        }
    }
}

class Bus extends Mobil {
    private DriverBus driverBus;
    private Penumpang[] daftarPassenger;

    public Bus(String nomorPolisi, String tipe, int jumlahPenumpang) {
        super(nomorPolisi, tipe, jumlahPenumpang);
        this.daftarPassenger = new Penumpang[jumlahPenumpang];
    }

    public DriverBus getDriverBus() {
        return driverBus;
    }

    public void setDriverBus(DriverBus driverBus) {
        this.driverBus = driverBus;
    }

    public void naikPenumpang(Penumpang penumpang) {
        for (int i = 0; i < daftarPassenger.length; i++) {
            if (daftarPassenger[i] == null) {
                daftarPassenger[i] = penumpang;
                break;
            }
        }
    }

    public void turunPenumpang(Penumpang penumpang) {
        for (int i = 0; i < daftarPassenger.length; i++) {
            if (daftarPassenger[i] != null && daftarPassenger[i].getNama().equals(penumpang.getNama())) {
                daftarPassenger[i] = null;
                break;
            }
        }
    }

    public void displayBus() {
        System.out.println("Nomor Polisi       : " + this.nomorPolisi);
        System.out.println("Tipe               : " + this.tipe);
        System.out.println("Jumlah penumpang   : " + this.jumlahPenumpang);
        System.out.println("Daftar penumpang : ");
        for (int i = 0; i < jumlahPenumpang; i++) {
            if (daftarPassenger[i] != null) {
            System.out.println((i + 1) + ". " + daftarPassenger[i].getNama());
            }
        }
    }
}

class Orang {
    protected String nama;

    public Orang() {

    }

    public Orang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

}

class DriverBus extends Orang {
    private boolean SIM_B;

    public DriverBus() {

    }

    public DriverBus(String nama, boolean SIM_B) {
        super(nama);
        this.SIM_B = SIM_B;
    }

    public boolean isSIM_B() {
        return SIM_B;
    }

    public void nyetirBus(Bus bus) {
        if (SIM_B == true) {
            System.out.println("Pengemudi bernama " + getNama() + " mengendarai bus " + bus.tipe + ".");
        } else {
            System.out.println("Pengemudi bernama " + getNama() + " tidak memiliki SIM B untuk menarik bus " + bus.tipe + ".");
        }
    }
}

class DriverAngkot extends Orang {
    private boolean SIM_A;

    public DriverAngkot() {

    }

    public DriverAngkot(String nama, boolean SIM_A) {
        super(nama);
        this.SIM_A = SIM_A;
    }

    public boolean isSIM_A() {
        return SIM_A;
    }

    public void nyetirAngkot(Angkot angkot) {
        if (SIM_A == true) {
            System.out.println("Pengemudi bernama " + getNama() + " mengendarai angkot " + angkot.tipe + ".");
        } else {
            System.out.println("Pengemudi bernama " + getNama() + " tidak memiliki SIM A untuk menarik angkot " + angkot.tipe + ".");
        }
    }

}

class Penumpang extends Orang {

    public Penumpang(String nama) {
        super(nama);
    }

    public void naikAngkot(Angkot angkot) {
        System.out.println("Penumpang bernama " + getNama() + " menaiki kendaraan angkot " + angkot.tipe + ".");
    }

    public void turunAngkot(Angkot angkot) {
        System.out.println("Penumpang bernama " + getNama() + " turun dari kendaraan angkot " + angkot.tipe + ".");
    }

    public void naikBus(Bus bus) {
        System.out.println("Penumpang bernama " + getNama() + " menaiki kendaraan bus " + bus.tipe + ".");
    }

    public void turunBus(Bus bus) {
        System.out.println("Penumpang bernama " + getNama() + " turun dari kendaraan bus " + bus.tipe + ".");
    }
}


public class Relationship {
    public static void main(String[] args) {
        Angkot angkot1 = new Angkot("N 1234 AB", "Suzuki", 10);
        Angkot angkot2 = new Angkot("B 121 FQI", "Toyota", 10);
        Bus bus1 = new Bus("N 4567 BG", "Mercedes Benz", 20);
        Bus bus2 = new Bus("AE 1 MS", "Hino", 20);

        DriverAngkot driverAngkot1 = new DriverAngkot("Pak Bagong", true);
        DriverAngkot driverAngkot2 = new DriverAngkot("Pak Sutarno", false);
        DriverBus driverBus1 = new DriverBus("Pak Rudi", true);
        DriverBus driverBus2 = new DriverBus("Pak Batir", false);
        System.out.println();

        Penumpang penumpang1 = new Penumpang("Lebron");
        Penumpang penumpang2 = new Penumpang("James");
        Penumpang penumpang3 = new Penumpang("Peter");
        Penumpang penumpang4 = new Penumpang("Tony");
        Penumpang penumpang5 = new Penumpang("Caitlin");
        Penumpang penumpang6 = new Penumpang("Stephen");
        Penumpang penumpang7 = new Penumpang("Klay");
        Penumpang penumpang8 = new Penumpang("Albert");
        Penumpang penumpang9 = new Penumpang("Skylar");
        Penumpang penumpang10 = new Penumpang("Celi");
        Penumpang penumpang11 = new Penumpang("Pai");
        Penumpang penumpang12 = new Penumpang("Kayes");
        Penumpang penumpang13 = new Penumpang("Vior");
        Penumpang penumpang14 = new Penumpang("Gaby");
        Penumpang penumpang15 = new Penumpang("Aisyah");
        Penumpang penumpang16 = new Penumpang("Citra");
        Penumpang penumpang17 = new Penumpang("Edith");
        Penumpang penumpang18 = new Penumpang("Fanny");
        Penumpang penumpang19 = new Penumpang("Angie");
        Penumpang penumpang20 = new Penumpang("Vania");
        System.out.println();

        driverAngkot1.nyetirAngkot(angkot1);
        driverAngkot1.nyetirAngkot(angkot2);
        driverAngkot2.nyetirAngkot(angkot1);
        driverAngkot2.nyetirAngkot(angkot2);
        driverBus1.nyetirBus(bus1);
        driverBus1.nyetirBus(bus2);
        driverBus2.nyetirBus(bus1);
        driverBus2.nyetirBus(bus2);
        System.out.println();

        angkot1.naikPenumpang(penumpang15);
        angkot1.naikPenumpang(penumpang10);
        angkot1.naikPenumpang(penumpang20);
        angkot1.naikPenumpang(penumpang7);
        angkot1.naikPenumpang(penumpang11);
        System.out.println();

        angkot2.naikPenumpang(penumpang2);
        angkot2.naikPenumpang(penumpang13);
        angkot2.naikPenumpang(penumpang12);
        angkot2.naikPenumpang(penumpang1);
        angkot2.naikPenumpang(penumpang17);
        System.out.println();

        bus1.naikPenumpang(penumpang3);
        bus1.naikPenumpang(penumpang6);
        bus1.naikPenumpang(penumpang9);
        bus1.naikPenumpang(penumpang14);
        bus1.naikPenumpang(penumpang18);
        System.out.println();

        bus2.naikPenumpang(penumpang4);
        bus2.naikPenumpang(penumpang5);
        bus2.naikPenumpang(penumpang8);
        bus2.naikPenumpang(penumpang16);
        bus2.naikPenumpang(penumpang19);
        System.out.println();

        angkot1.displayAngkot();
        angkot2.displayAngkot();
        bus1.displayBus();
        bus2.displayBus();
    }
}
