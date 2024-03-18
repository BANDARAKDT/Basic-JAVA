
class stateThread extends Thread{
    public void run(){
        System.out.println("Thread state: New");
        System.out.println("Thread state: Runnable");
        System.out.println("Thread state: Running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread state: Waiting");
    }
}
public class State {
    public static void main(String[] args) {
        stateThread obj = new stateThread();
        obj.start();
        try {
            obj.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread state: Terminated");


    }
}