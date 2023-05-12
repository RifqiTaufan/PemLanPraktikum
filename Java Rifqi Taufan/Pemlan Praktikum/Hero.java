public class Hero {
    private String name;
    private double HP;
    private double ATK;
    private double defense;

    public Hero() {

    }

    public Hero(String name, double HP, double ATK, double defense) {
        this.name = name;
        this.HP = HP;
        this.ATK = ATK;
        this.defense = defense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getHP() {
        return HP;
    }

    public void setATK(double ATK) {
        this.ATK = ATK;
    }

    public double getATK() {
        return ATK;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getDefense() {
        return defense;
    }

    public void attack(Hero hero) {
        double damage = this.ATK - hero.defense;
        if (damage < 0)
            damage = 0;

        System.out.println(this.name + " menyerang " + hero.name + " sebesar " + damage + " damage. ");
        hero.defense(damage);
    }

    public void defense(double damage) {
        this.HP -= damage;
        if (this.HP < 0)
            this.HP = 0;

        System.out.println(this.name + " menerima " + damage + " damage");
    }

    public void informasiHero() {
        System.out.println("========INFORMASI HERO========");
        System.out.println("Nama Hero   = " + this.name);
        System.out.println("HP          = " + this.HP);
        System.out.println("Attack      = " + this.ATK);
        System.out.println("Defense     = " + this.defense);
    }
}