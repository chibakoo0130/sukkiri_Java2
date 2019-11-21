public class Wand {
    private String name; // 杖の名前
    private double power; // 杖の魔力

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前が入力されていません。処理を中断。");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("名前が短すぎます。処理を中断。");
        }
        this.name = name;
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double power) {
        if (power < 0.5 && power > 100) {
            throw new IllegalArgumentException("魔力は0.5以上100以下です。処理を中断。");
        }
        this.power = power;
    }
}