public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // ここで何らかの時間がかかる処理
        int[] array = new int[10000];
        for (int i : array) {
            array[i] = i;
            i += 1;
            System.out.println(array);
        }
        long end = System.currentTimeMillis();
        System.out.println("処理にかかった時間は・・・" + (end - start) + "ミリ秒でした");
    }
}