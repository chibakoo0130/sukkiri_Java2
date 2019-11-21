public class PoisonMatango extends Matango {
    private int PoisonAttackCount = 5;

    PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero h) {
        super.attack(h);
        if (this.PoisonAttackCount > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int PoisonDamage = h.getHp() / 5;
            h.setHp(h.getHp() - PoisonDamage);
            System.out.println(PoisonDamage + "ポイントのダメージ");
            this.PoisonAttackCount -= 1;
        }
    }
}