package KR.Cloning.DeepWithReflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Aa", 5, 1);
        System.out.println("Cow " + cow);

        Cow cloneCow = reflectionCloning(cow);
        System.out.println("Cloned cow " + cloneCow);

        System.out.println("After cloning");

        cloneCow.setName("Bb");
        System.out.println("Cow " + cow);
        System.out.println("Cloned cow " + cloneCow);
    }

    private static Cow reflectionCloning(Cow cow) {
        Cow cloneCow = new Cow();
        try {
            Field name = Cow.class.getDeclaredField("name");
            Field age = Cow.class.getDeclaredField("age");
            Field head = Cow.class.getDeclaredField("head");

            name.setAccessible(true);
            age.setAccessible(true);
            head.setAccessible(true);

            name.set(cloneCow, cow.getName());
            age.set(cloneCow, cow.getAge());
            head.set(cloneCow, cow.getHead());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return cloneCow;
    }
}
