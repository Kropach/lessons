package KR.Cloning.DeepWithConstructor;

public class Student {
    private int age;
    private String name;
    private Group group;

    public Student(int age, String name, Group group) {
        this.age = age;
        this.name = name;
        this.group = group;
    }

    // copy constructor
    public Student(Student other){
        this(other.age, other.name, new Group(other.group.getId()));
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", group=" + group +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
