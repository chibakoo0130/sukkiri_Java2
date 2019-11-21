public class Main {
    public static double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2;
    }
    public static double calcCricleArea(double radius) {
        return radius * radius * 3.14;
    }
    public static void main(String[] args) {
        System.out.println(calcTriangleArea(10.0, 5.0));
        System.out.println(calcCricleArea(5.0));
    }
}