public class Hero extends Charcter {
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージを与えた！");
        m.hp -= 5;
    }
    public void attack(Goblin g) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージを与えた！");
        g.hp -= 10;
    }

    // 以下スライム用など続く
}