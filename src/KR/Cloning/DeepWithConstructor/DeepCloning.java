package KR.Cloning.DeepWithConstructor;

public class DeepCloning {
    public static void main(String[] args) {
        Student student = new Student(20, "Aa", new Group(1));
        Student cloneStudent = new Student(student);
        System.out.println(student);
        System.out.println(cloneStudent);
        System.out.println("After cloning");
        cloneStudent.setName("Bb");
        cloneStudent.getGroup().setId(2);
        System.out.println(student);
        System.out.println(cloneStudent);
    }
}
