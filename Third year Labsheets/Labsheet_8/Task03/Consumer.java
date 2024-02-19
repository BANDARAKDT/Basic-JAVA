package Task03;

import java.util.Queue;

class Consumer extends Thread {
    private final Queue<Integer> queue;

    public Consumer(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                // Wait if the queue is empty
                while (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Consume item and notify producer thread
                int number = queue.poll();
                System.out.println("Consuming: " + number);
                queue.notifyAll();
            }
        }
    }
}
