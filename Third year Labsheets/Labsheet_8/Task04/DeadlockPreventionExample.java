package Task04;

public class DeadlockPreventionExample {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread1: Holding lock on resource1...");
                try {
                    Thread.sleep(100); // Introducing delay to make deadlock more probable
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread1: Waiting for lock on resource2...");
                synchronized (resource2) {
                    System.out.println("Thread1: Acquired lock on resource2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource1) { // Resource order changed to prevent deadlock
                System.out.println("Thread2: Holding lock on resource1...");
                try {
                    Thread.sleep(100); // Introducing delay to make deadlock more probable
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread2: Waiting for lock on resource2...");
                synchronized (resource2) {
                    System.out.println("Thread2: Acquired lock on resource2");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
