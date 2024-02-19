package Task03;

import java.util.Queue;

public class Producer extends Thread{
    private final Queue<Integer>queue;
    private final int maxSize;


    public Producer(Queue<Integer> queue, int maxSize){
        this.queue=queue;
        this.maxSize=maxSize;
    }

    @Override
    public void run() {
      int number=1;
      while (true) {
        synchronized(queue){
            while (queue.size()==maxSize) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                   
                    e.printStackTrace();
                }
                
            }
            System.out.println("Producing: "+number);
            queue.add(number++);

            queue.notifyAll();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
      }
    }
    
}
