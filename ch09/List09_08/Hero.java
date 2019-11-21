public class Hero {
    int hp;
    String name;

    void attack() {
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に5ポイントのダメージを与えた！");
    }

    Hero() {
        this.hp = 100; // HPフィールドを100で初期化
    }
}