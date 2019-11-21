// List09_03
// 次にHeroクラスを定義する
public class Hero {
    String name;
    int hp;
    Sword sword;
    void attack() {
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に5ポイントのダメージを与えた！");
    }
}