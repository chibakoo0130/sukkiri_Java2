public class SuperHero {
    private String name = "ミナト";
    private int hp = 100;
    private boolean flying;

    // 戦う
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた！");
    }

    // 逃げる
    public void run() {
        System.out.println(this.getName() + "は逃げ出した！");
    }

    // 飛ぶ
    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった！");
    }

    // 着地する
    public void land() {
        this.flying = false;
        System.out.println("着地した！");
    }
}