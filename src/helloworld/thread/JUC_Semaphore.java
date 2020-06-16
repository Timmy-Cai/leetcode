package helloworld.thread;

import java.util.concurrent.Semaphore;

public class JUC_Semaphore {

    // 信号量
    public static final int N = 10;
    public Semaphore mutex = new Semaphore(1); // 互斥
    public Semaphore notFull = new Semaphore(N); // 生产者使用，小于N时，可以生产
    public Semaphore notEmpty = new Semaphore(0); // 消费者使用，大于0时，可以消费

    // 资源
    public static int item = 0;

    public static void main(String[] args) {
        JUC_Semaphore pc = new JUC_Semaphore();
        new Thread(pc.new Producer()).start();
        new Thread(pc.new Consumer()).start();
        new Thread(pc.new Producer()).start();
        new Thread(pc.new Consumer()).start();
        new Thread(pc.new Producer()).start();
        new Thread(pc.new Consumer()).start();
        new Thread(pc.new Producer()).start();
        new Thread(pc.new Consumer()).start();
    }

    public class Producer implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    notFull.acquire(); // 保证非满-1
                    mutex.acquire();
                    item++; // 增加库存
                    System.out.println("Produce: " + item);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    mutex.release();
                    notEmpty.release(); // 通知消费+1
                }
            }
        }
    }

    public class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    notEmpty.acquire(); // 保证非空-1
                    mutex.acquire();
                    item--; // 减少库存
                    System.out.println("Consumer: " + item);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    mutex.release();
                    notFull.release(); // 通知生产+1
                }
            }
        }
    }
}
