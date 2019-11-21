import java.util.*;

public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた！");
        this.mp -= 5;
        this.hp = MAX_HP;
        System.out.println(this.name + "のHPが全回復した。");
    }

    public int pray(int sec) {
        System.out.println(this.name + "は" + sec + "秒間天に祈った！");
        // 回復量を乱数を用いて決定する
        int recovery_mp = sec + new Random().nextInt(3);
        if (recovery_mp > 10) {
            this.mp = 10;
            System.out.println("聖職者のMPが" + (MAX_MP - mp) + "回復した！");
            return recovery_mp
        } else {
            this.mp += recovery_mp;
            System.out.println("聖職者のMPが" + recovery_mp + "回復した！");
            return recovery_mp
        }
        // 回答例参考
        // actualRecovery_mp = Math.min(this.MAX_MP - this.mp, recover);

        // this.mp += actualRecovery_mp;
        // System.out.println(this.name "のMPが" + actualRecovery_mp + "回復した。");
        // return actualRecovery_mp;
    }
}