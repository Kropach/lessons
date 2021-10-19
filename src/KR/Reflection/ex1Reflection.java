package KR.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ex1Reflection {
    private static final class CatFields{
        public String name = "Marsel";
        private int age = 8;
        short ears = 5;
        protected long tail = 30;

        public CatFields() {
        }

        public CatFields(String name) {
            this.name = name;
        }

        public CatFields(int age) {
            this.age = age;
        }

        public CatFields(String name, int age, short ears, long tail) {
            this.name = name;
            this.age = age;
            this.ears = ears;
            this.tail = tail;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public short getEars() {
            return ears;
        }

        public void setEars(short ears) {
            this.ears = ears;
        }

        public long getTail() {
            return tail;
        }

        public void setTail(long tail) {
            this.tail = tail;
        }
    }

    public static void main(String[] args){
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";

        Class<?> cl = CatFields.class;
        System.out.println(s + "public modifier reflection fields:");
        Field[] fields = cl.getFields();
        Constructor<?>[] constructors = cl.getConstructors();
        int i = 0;
        for (Constructor<?> ctr :
                constructors) {
            System.out.print(s + "\tConstructor " + (++i) + ": ");
            Class<?>[] paramTypes = ctr.getParameterTypes();
            for (Class<?> paramType :
                    paramTypes) {
                System.out.print(s1 + paramType.getName() + " ");
            }
            System.out.print("\n");
        }

        try {
            Class<?>[] paramTypes = new Class<?>[]{
                    int.class
            };
            Constructor<?> ctr = cl.getConstructor(paramTypes);
            CatFields catFields = (CatFields) ctr.newInstance(Integer.valueOf(1));
            System.out.println(s + "Fields: " + s1 + " Age = " + catFields.getAge() + ", Name = " + catFields.getName() +
                    ", Ears = " + catFields.getEars() + ", Tail = " + catFields.getTail());
        } catch (Exception ex){
            ex.printStackTrace();
        }

        Method[] methods = cl.getMethods();
        for (Method method :
             methods) {
            System.out.print(s + "Name: " + s2 + method.getName());
            System.out.print(s + "\treturn type: " + s2 + method.getReturnType().getName());
            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print(s + "\tparam types: " + s1);
            for (Class<?> paramType :
                    paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }

        try {
            CatFields catFields = new CatFields();
            Class<?>[] paramTypes = new Class<?>[]{
                    int.class
            };
            Method method = cl.getMethod("setAge", paramTypes);
            Object[] objArg = new Object[]{Integer.valueOf(8)};
            method.invoke(catFields, objArg);
            System.out.println(s + "Age: " + s1 + catFields.getAge());
        } catch (Exception ex){
            ex.printStackTrace();
        }

        for (Field field:
             fields) {
            Class<?> fieldType = field.getType();
            System.out.print(s2 + "\tName: " + s1 + field.getName() + " ");
            System.out.println(s2 + "\tType: " + s1 + fieldType.getName());
        }
        System.out.println(s + "all modifiers reflection fields:");
        fields = cl.getDeclaredFields();
        for (Field field :
                fields) {
            Class<?> fieldType = field.getType();
            System.out.print(s2 + "\tName: " + s1 + field.getName() + " ");
            System.out.println(s2 + "\tType: " + s1 + fieldType.getName());
        }

        try {
            Field field = cl.getDeclaredField("age");
            // снимаем модификатор до public
            CatFields catFields = new CatFields();
            field.setAccessible(true);
            field.setInt(catFields, 10);
            System.out.println("New private field value: " + field.getInt(catFields));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
