package KR.Cloning.DeepWithStatic;

public class Human {
    private int age;
    private String name;

    public Human() {}

    public static Human getHumanInstanceWithAgeAndName(int age, String name){
        Human instance = new Human();
        instance.age = age;
        instance.name = name;
        return instance;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
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
}
