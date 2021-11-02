package KR.Thread.Problems.daemon;

public class Daemon extends Thread{
    @Override
    public void run() {
        try {
            if (isDaemon()){
                System.out.println("Start daemon");
                sleep(1000);
            } else {
                System.out.println("Start ordinary");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (isDaemon()){
                System.out.println("Finish daemon");
            } else {
                System.out.println("Finish ordinary");
            }
        }
    }
}
