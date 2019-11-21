public class Main{
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        a = null;               // 参照を切る、例外エラー
        a[0] = 10;
    }
}