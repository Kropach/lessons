package KR.Regular;

public class ex1 {
    public static void main(String[] args) {
        String s1 = "Hello, my name is A. How r u? I am fine.";
        String[] arr = s1.split("[.?]");
        for (String str:
                arr) {
            System.out.println(str);
        }
    }
}
