public class Main {
    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];
        Monster[0] = new Slime();
        Monster[1] = new DeathBat();
        Monster[2] = new Goblin();
        for (Monster m : monsters) {
            m.run();
        }
    }
}