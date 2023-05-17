public class Main {
    public static void main(String[] args) {
        //Main sesuai study case dalam modul

    //1a
        Manusia hmn1 = new Manusia("Budi", true, "32953782", true);
        System.out.println(hmn1);
        System.out.println();
    //1b
        Manusia hmn2 = new Manusia("Natasya", false, "10329384", true);
        System.out.println(hmn2);
        System.out.println();
    //1c
        Manusia hmn3 = new Manusia("Ryan", true, "38340926", false);
        System.out.println(hmn3);
        System.out.println();
    //2a
        MahasiswaFILKOM saya1 = new MahasiswaFILKOM("Muhammad Rifqi Taufan", true, "3375011002050005", false, "225150707111080", 2.5);
        System.out.println(saya1);
        System.out.println();
    //2b
        MahasiswaFILKOM saya2 = new MahasiswaFILKOM("Muhammad Rifqi Taufan", true, "3375011002050005", false, "225150707111080", 3.4);
        System.out.println(saya2);
        System.out.println();
    //2c
        MahasiswaFILKOM saya3 = new MahasiswaFILKOM("Muhammad Rifqi Taufan", true, "3375011002050005", false, "225150707111080", 4);
        System.out.println(saya3);
        System.out.println();
    //3a
        Pekerja worker1 = new Pekerja("Mane", true, "92348427", true, 1000.0, 2, 2021, 5, 17);
        System.out.println(worker1);
        System.out.println();
    //3b
        Pekerja worker2 = new Pekerja("Adib", true, "88475391", false, 1000.0, 0, 2014, 5, 17);
        System.out.println(worker2);
        System.out.println();
    //3c
        Pekerja worker3 = new Pekerja("Adinda", false, "43857681", true, 1000.0, 10, 2003, 5, 17);
        System.out.println(worker3);
        System.out.println();
    //4
        Manager manager = new Manager("HRD", "Sugeng", true, "02139025", true, 1000.0, 0, 2008, 5, 17);
        System.out.println(manager);

        // Manusia a = new Manusia("A", true, "111", true);
        // System.out.println(a);
        // System.out.println();

        // MahasiswaFILKOM b = new MahasiswaFILKOM("B", false, "111", false, "165150300111100", 4);
        // System.out.println(b);
        // System.out.println();

        // Pekerja c = new Pekerja("C", true, "111", true, 1000.0, 4, 2016, 3, 2);
        // System.out.println(c);
        // System.out.println();

        // Manager d = new Manager("HRD", "D", true, "111", true, 1000.0, 3, 2017, 1, 2);
        // System.out.println(d);
    }   
}
