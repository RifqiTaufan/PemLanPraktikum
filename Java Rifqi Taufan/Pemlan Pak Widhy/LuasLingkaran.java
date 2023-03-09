public class luasLingkaran {
    private double jariJari;
    
    public luasLingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
    
    public double getJariJari() {
        return jariJari;
    }
    
    public void hasilJariJari(double radius) {
        this.jariJari = radius;
    }
}
