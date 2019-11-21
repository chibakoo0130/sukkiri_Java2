public class Main {
    public static void main(String[] args) {
        int i;
        try {
            i = Integer.parseInt("三");
        } catch (NumberFormatException e) {
            System.out.println("NumberFortmatExceptionをcatchしました");
        }
    }
}