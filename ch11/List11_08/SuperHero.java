public class SuperHero {
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた！");
        if (this.flying) {
            System.out.println(this.name + "の攻撃！");
            m.hp -= 5;
            System.out.println("5ポイントのダメージを与えた！");
        }
    }
}