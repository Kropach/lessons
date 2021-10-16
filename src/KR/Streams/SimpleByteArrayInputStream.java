package KR.Streams;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class SimpleByteArrayInputStream {
    public static void main(String[] args) {
        byte[] arr = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);

        int temp;
        while ((temp = byteArrayInputStream.read()) != -1){
            System.out.println(temp);
        }

        String str = "Hello";
        byte[] arr2 = str.getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr2, 2, 3);
        while ((temp = byteArrayInputStream1.read()) != -1){
            System.out.println((char)temp);
        };
    }
}