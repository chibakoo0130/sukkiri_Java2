public class Main2 {
    public static void main(String[] args) {
        Wizard w = new Wizard();
        Character c = w;
        Matango m = new Matango('A');
        c.name = "アサカ";
        c.attack(m);
        c.fireball(m);
    }
}