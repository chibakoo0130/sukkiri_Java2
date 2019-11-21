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

    public void attack() {
        System.out.println(this.name + "の攻撃！");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
        }
        this.name = name; // 検査完了。代入しても問題なし。
    }
}
