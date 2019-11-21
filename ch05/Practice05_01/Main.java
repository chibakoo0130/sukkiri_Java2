public class Main {
    public static void introduceOneself() {
        String name = "kotaro";
        int age = 23;
        double height = 168.00;
        char gender = '男';

        System.out.println("私の名前は" + name + "、" + age + "歳" + gender + "です。");
        System.out.println("身長は" + height + "です。");
    }
    public static void main(String[] args) {
        introduceOneself();
    }
}