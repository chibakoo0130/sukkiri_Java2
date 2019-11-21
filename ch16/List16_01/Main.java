import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        String filename = "/Users/chibakotaro/test.txt";
        FileReader fr = new FileReader(filename);
        char c1 = (char) fr.read();
        System.out.println(c1);
        char c2 = (char) fr.read();
        System.out.println(c2);
        fr.close();
    }
}