package KR.Streams;

import java.io.*;

public class SimpleDataInputStream {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dataOut.txt")));
                DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("dataOut.txt")))){
            outputStream.writeShort(1000);
            outputStream.writeInt(1111);
            outputStream.writeLong(10L);
            outputStream.writeUTF("Hello World!");
            outputStream.flush();

            System.out.println("short " + inputStream.readShort());
            System.out.println("int " + inputStream.readInt());
            System.out.println("Long " + inputStream.readLong());
            System.out.println("String " + inputStream.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
