package KR;

public interface Robot {
    String name();
    class Test{
        public static void test(Robot r) {
            System.out.println("Robot name: " + r.name());
        }
    }
}
