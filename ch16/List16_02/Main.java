import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String filename = "/Users/chibakotaro/test.txt";
        FileWriter fw = new FileWriter(filename);
        fw.write('そ');
        fw.write('れ');
        fw.close();
    }
}