import java.util.Scanner;

class SegiEmpat {
    public double panjang;
    public double lebar;
    
    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
    public double hitungDiagonal() {
        return Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2));
    }
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Masukkan panjang segiempat: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar segiempat: ");
        double lebar = input.nextDouble();
        
        SegiEmpat segiempat = new SegiEmpat(panjang, lebar);
        
        System.out.println("Luas segiempat: " + segiempat.hitungLuas());
        System.out.println("Keliling segiempat: " + segiempat.hitungKeliling());
        System.out.println("Diagonal segiempat: " + segiempat.hitungDiagonal());
    }
}

