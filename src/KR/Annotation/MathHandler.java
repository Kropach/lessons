package KR.Annotation;

public class MathHandler {
    @MathAnno(num1 = 10, num2 = 20)
    public int add(int num1, int num2){
        return num1 + num2;
    }
}
