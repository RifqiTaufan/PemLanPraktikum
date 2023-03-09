import java.util.Scanner;
public class MainLingkaran {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = input.nextDouble();
        
        LuasLingkaran lingkaran1 = new LuasLingkaran(radius);
        double luas = lingkaran1.hitungLuas();
        
        System.out.println("Luas lingkaran dengan jari-jari " + lingkaran1.getJariJari() + " adalah " + luas);
    }
}
