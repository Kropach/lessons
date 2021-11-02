package KR.Thread.Problems.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        SimpleCounterThread[] counterThread = new SimpleCounterThread[10];

        fillingArrayOfCounterThread(counter, counterThread);
        startingEachThread(counterThread);
        joinEveryThread(counterThread);

        System.out.println(counter.getCounter());

    }

    private static void joinEveryThread(SimpleCounterThread[] counterThread) {
        for (SimpleCounterThread simpleCounterThread : counterThread) {
            try {
                simpleCounterThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void startingEachThread(SimpleCounterThread[] counterThread) {
        for (SimpleCounterThread simpleCounterThread : counterThread) {
            simpleCounterThread.start();
        }
    }

    private static void fillingArrayOfCounterThread(Counter counter, SimpleCounterThread[] counterThread) {
        for (int i = 0; i < 10; i++) {
            counterThread[i] = new SimpleCounterThread(counter, 1000);
        }
    }
}

class Counter{
    private long counter = 0l;
    Lock reentrantLock = new ReentrantLock();

    public void incrementCurrentValue(){
        reentrantLock.lock();
        try {
            counter++;
        } finally {
            reentrantLock.unlock();
        }
    }

    public long getCounter() {
        return counter;
    }
}

class SimpleCounterThread extends Thread{
    private Counter counter;
    private int num;

    SimpleCounterThread(Counter counter, int num){
        this.counter = counter;
        this.num = num;
    }

    @Override
    public void run(){
        for (int i = 0; i < num; i++) {
            counter.incrementCurrentValue();
        }
    }
}
