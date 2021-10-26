package KR.Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Group group = new Group("Java");
        Student student = new Student(1, "Aa");
        student.setGroup(group);
        group.setStudent(student);

        File file = new File("C:\\Users\\akropachev\\IdeaProjects\\lessons\\src\\KR\\Serialization\\output.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))){
            outputStream.writeObject(student);
            student = null;
            student = (Student) inputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
