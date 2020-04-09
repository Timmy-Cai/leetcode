package helloworld;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPrint {
    private static AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                if (atomicInteger.get() % 3 == 0) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程1：A" + atomicInteger.getAndIncrement());
                }
            }
        });


        Thread t2 = new Thread(() -> {
            while (true) {
                if (atomicInteger.get() % 3 == 1) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程2：B" + atomicInteger.getAndIncrement());
                }
            }
        });


        Thread t3 = new Thread(() -> {
            while (true) {
                if (atomicInteger.get() % 3 == 2) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程3：C" + atomicInteger.getAndIncrement());
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
