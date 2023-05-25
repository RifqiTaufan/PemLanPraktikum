public class Invoice implements Payable {
    private String productName;
    private Integer quantity;
    private Integer pricePerItem;

    public Invoice(String productName, Integer quantity, Integer pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    public void Informasi() {
        System.out.printf("%-17s: %s\n", "Nama Produk", getProductName());
        System.out.printf("%-17s: %d\n", "Kuantitas", getQuantity());
        System.out.printf("%-17s: $%d\n", "Harga per Barang", getPricePerItem());
        System.out.printf("%-17s: $%.0f\n", "Total Harga", getPayableAmount());
        System.out.println();
    }
}
