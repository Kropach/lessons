package KR.Thread;

import java.util.ArrayList;

//public class SimpleThread extends Thread {
public class SimpleThread implements Runnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t = new Thread(new SimpleThread());
        t.start();
        ArrayList al = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            al.add(new Object());
        }
        System.out.println("Hello");
    }
//  ??? ? extends, ??? ? implements ? 5-6 ?????? ?????????????? ????? run
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ' ' + i);
        }
    }
}
