public class Hero {
    private int hp;
    private String name;
    private String sword;
    
    static int money;

    void bye() {
        System.out.println("勇者は別れを告げた");
    }

    private void die() {
        System.out.println(this.name + "は死んでしまった！");
        System.out.println("GAMEOVERです。");
    }

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した！");
    }

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
    }
}