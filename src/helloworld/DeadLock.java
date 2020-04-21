package helloworld;

public class DeadLock {
    private static final String LOCK_1 = "LOCK_1";
    private static final String LOCK_2 = "LOCK_2";

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (LOCK_1) {
                System.out.println("线程1: " + LOCK_1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (LOCK_2) {
                    System.out.println("线程1: " + LOCK_2);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (LOCK_2) {
                System.out.println("线程2: " + LOCK_2);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (LOCK_1) {
                    System.out.println("线程2: " + LOCK_1);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
