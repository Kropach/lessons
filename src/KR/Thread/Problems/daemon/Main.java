package KR.Thread.Problems.daemon;

public class Main {
    public static void main(String[] args) {
        Daemon daemon1 = new Daemon();
        Daemon daemon2 = new Daemon();

        daemon1.setDaemon(true);
        daemon1.start();
        daemon2.start();
    }
}
