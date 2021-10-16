package KR.Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleBufferReader {

    public static void main(String[] args) throws IOException {
        // Для больших объемов данных
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//            int num = Integer.parseInt(br.readLine());
//            System.out.println(num);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        int i = System.in.read();
//        System.out.println(i);
        // Для текстов
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        int i2 = inputStreamReader.read();
        System.out.println(i2);
        System.out.println((char) i2);
    }
}
