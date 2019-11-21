public class Hero {

    public final void slip() {
        this.hp -= 5;
        System.out.println(this.getName() + "は転んだ！");
        System.out.println("5のダメージ");
    }

    public void run() {
        System.out.println(this.getName() + "は逃げ出した！");
    }
}