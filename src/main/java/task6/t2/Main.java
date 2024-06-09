package task6.t2;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));

        var fileOutputStream = new FileOutputStream("test.txt");
        var fileInputStream = new FileInputStream("test.txt");

        fileOutputStream.write(reader.readLine().getBytes());

        int i;

        while((i = fileInputStream.read()) != -1){

            System.out.print((char)i);
        }

        fileOutputStream.close();
    }
}
