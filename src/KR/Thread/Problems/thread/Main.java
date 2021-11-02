package KR.Thread.Problems.thread;

public class Main extends Thread{
    private String word;
    private int delay;

    public Main(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }


    @Override
    public void run() {
        for (; ;) {
            System.out.println(word + " ");
            try{
                sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Main ping = new Main("ping", 33);
        Main pong = new Main("pong", 100);

        Thread t1 = new Thread(ping);
        Thread t2 = new Thread(pong);

        t1.start();
        t2.start();
    }
}
