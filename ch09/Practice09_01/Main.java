public class Main {
    public static void main(String[] args) {
        Cleric c1 = new Cleric("a");
        Cleric c2 = new Cleric("b", 10);
        Cleric c3 = new Cleric("c", 5, 5);
        System.out.println(c1.name + c1.hp + c1.mp);
        System.out.println(c2.name + c2.hp + c2.mp);
        System.out.println(c3.name + c3.hp + c3.mp);
    }
}