package KR.Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SimpleErr {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("C:");
            System.out.println("File opened");
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("File opening failed ");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
