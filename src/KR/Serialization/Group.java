package KR.Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Group implements Serializable {
    private String name;
    private transient Student student;

    public Group(String name) {
        this.name = name;
    }

    private void writeObject(ObjectOutputStream oos){
        try {
            // сериализуем те поля, которые можно по дефолту
            oos.defaultWriteObject();
            // сериализуем те поля, которые нельзя по дефолту
            oos.writeInt(student.getId());
            oos.writeObject(student.getName());
            oos.writeObject(student.getGroup());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois){
        try {
            // десериализуем те поля, которые можно по дефолту
            ois.defaultReadObject();
            // десериалируем те поля, которые нельзя по дефолту
            this.student = new Student(ois.readInt(), (String) ois.readObject());
//            this.student.setGroup((Group) ois.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
