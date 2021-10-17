package KR.Strings;

public class SimpleString {
    public static void main(String[] args) {
        String str = "Hello"; // create a string in a string pool
        String str2 = new String("Hello"); // create a string in a heap
        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(arr, 0, 2);
        str3 = str3.concat(str2).concat(str);

        System.out.println(str3);
        System.out.println(str.equals(str2));
        System.out.println(str.startsWith("H"));
        System.out.println(str == str2.intern()); // intern() moves a string to the string pool

        String str4 = new StringBuilder().append(str).append(2).toString();
        System.out.println(str4);

        StringBuffer sb = new StringBuffer();
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
        sb.append("Java");
        System.out.println(sb);
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
        System.out.println("capacity = " + sb.reverse());
    }
}
