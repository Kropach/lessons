package KR.Cloning.Shallow;

public class ShallowCloning {
    public static void main(String[] args) {
        Group group = new Group(1);
        Student student = new Student("Aa", 12, group);

        try {
            Student cloneStudent = (Student) student.clone();
            System.out.println(student);
            System.out.println(cloneStudent);
            cloneStudent.setName("Bb");
            student.getGroup().setId(2);
            System.out.println("After cloning");
            System.out.println(student);
            System.out.println(cloneStudent);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
