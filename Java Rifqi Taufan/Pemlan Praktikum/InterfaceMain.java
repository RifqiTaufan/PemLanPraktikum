public class InterfaceMain {
    public static void main(String[] args) {
        Payable[] payables = new Payable[6];

        Invoice invoice1 = new Invoice("Laptop", 1, 1000);
        Invoice invoice2 = new Invoice("Bag", 2, 200);
        Invoice invoice3 = new Invoice("Shoe", 4, 100);

        Employee karyawan1 = new Employee(12831, "Jeremy", 2000, new Invoice[] {invoice1});
        Employee karyawan2 = new Employee(14820, "Nathan", 4000, new Invoice[] {invoice2});
        Employee karyawan3 = new Employee(19357, "Isabella", 1000, new Invoice[] {invoice3});

        payables[0] = invoice1;
        payables[1] = invoice2;
        payables[2] = invoice3;
        payables[3] = karyawan1;
        payables[4] = karyawan2;
        payables[5] = karyawan3;

        System.out.println("====================INFORMASI TAGIHAN KARYAWAN===================");
        for (Payable tagihan : payables) {
            if (tagihan instanceof Invoice) {
                Invoice invoice = (Invoice) tagihan;
                invoice.Informasi();
            } else {
                Employee karyawan = (Employee) tagihan;
                karyawan.Informasi();
            }
        }
    }
}
