package KR.Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegex {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("[a-zA-Z]+\\s*[a-zA-Z]+");
//        Matcher m = pattern.matcher("Hello World");
//        System.out.println(m.matches());
//        Pattern pattern = Pattern.compile("[a-z&&[^d]]+", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE);
//        Matcher m = pattern.matcher("text");
//        System.out.println(m.matches());
        Pattern pattern = Pattern.compile("\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}");
        Matcher m = pattern.matcher("+7(999)123-45-67");
        System.out.println(m.matches());
    }
}
