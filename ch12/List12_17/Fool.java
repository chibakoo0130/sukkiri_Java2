public class Fool extends Character implements Human {
    // CharacterからhpやgetName()などのメンバを継承している
    // Characterから継承した抽象メソッドattack()を実装
    public void attack(Matamgo m) {
        System.out.println(this.getName() + "は戦わずに遊んでいる。");
    }

    // さらにHumanから継承した4つの抽象メソッドを実装
    public void talk() {
    }

    public void watch() {
    }

    public void hear() {
    }

    public void run() {
    }
}