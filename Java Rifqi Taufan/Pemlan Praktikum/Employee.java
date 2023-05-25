public class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;

    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public void Informasi() {
        System.out.printf("%-21s: %s\n", "Nama", getName());
        System.out.printf("%-21s: %d\n", "Nomor Registrasi", getRegistrationNumber());
        System.out.printf("%-21s: $%d\n", "Gaji per Bulan", getSalaryPerMonth());
        System.out.printf("%-21s: $%.0f\n", "Total Karyawan Bayar", getPayableAmount());
        System.out.println();
    }
}
