package KR.Cloning.DeepWithSerialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Aa", 2, 1);
        ByteArrayOutputStream byteOutput;
        ByteArrayInputStream byteInput;

        ObjectOutputStream output;
        ObjectInputStream input;
        try {
            byteOutput = new ByteArrayOutputStream();
            output = new ObjectOutputStream(byteOutput);

            output.writeObject(cow);
            output.flush();
            output.close();

            byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
            input = new ObjectInputStream(byteInput);

            Cow cloneCow = (Cow) input.readObject();
            input.close();

            System.out.println(cow);
            System.out.println(cloneCow);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
