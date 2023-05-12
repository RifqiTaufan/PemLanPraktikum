import java.util.Scanner;
public class HeroMain {
    private static final Scanner input = new Scanner(System.in);
    public static void main (String[] args) {

        Hero hero1 = new Hero();
        System.out.print("Masukkan nama hero 1 = ");
        hero1.setName(input.nextLine());
        System.out.print("Masukkan HP hero 1 = ");
        hero1.setHP(input.nextDouble());
        System.out.print("Masukkan attack hero 1 = ");
        hero1.setATK(input.nextDouble());
        System.out.print("Masukkan defense hero 1 = ");
        hero1.setDefense(input.nextDouble());
        System.out.println();
        hero1.informasiHero();
        
        Hero hero2 = new Hero();
        System.out.print("Masukkan nama hero 2 = ");
        hero2.setName(input.next());
        System.out.print("Masukkan HP hero 2 = ");
        hero2.setHP(input.nextDouble());
        System.out.print("Masukkan attack hero 2 = ");
        hero2.setATK(input.nextDouble());
        System.out.print("Masukkan defense hero 2 = ");
        hero2.setDefense(input.nextDouble());
        System.out.println();
        hero2.informasiHero();

        int round = 1;
        while (hero1.getHP() > 0 && hero2.getHP() > 0) {
            System.out.println("Round " + round);
            System.out.println("==========================================");

            hero1.attack(hero2);
            System.out.println("Sisa HP " + hero2.getName() + " adalah " + hero2.getHP());
            System.out.println();

            hero2.attack(hero1);
            System.out.println("Sisa HP " + hero1.getName() + " adalah " + hero1.getHP());
            System.out.println();
            round++;
        }

        if (hero1.getHP() < hero2.getHP()) {
            System.out.println(hero1.getName() + " kalah.");
            System.out.println("Pemenangnya adalah = " + hero2.getName());
        } else if (hero2.getHP() < hero1.getHP()) {
            System.out.println(hero2.getName() + " kalah.");
            System.out.println("Pemenangnya adalah = " + hero1.getName());
        } else {
            System.out.println("Battle Seri!");
        }
    }
}
