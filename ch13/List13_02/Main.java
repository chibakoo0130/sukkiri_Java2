// List13_03
public class Main {
    public static void main(String[] args) {
        Wizard w = new Wizard();
        Matango m = new Matango('A');
        w.name = "アサカ";
        w.attack(m);
        w.fireball(m);
    }
}