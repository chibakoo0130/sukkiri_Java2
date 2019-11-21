public class Main {
    public static void main(String[] args) {
        X obj = new A();
        obj.a(); // X型変数に入れているのでa()のみコンパイルできる
        // obj.b();
        // obj.c();

        Y y1 = new A();
        Y y2 = new B();
        y1.a();
        y2.b();
    }
}