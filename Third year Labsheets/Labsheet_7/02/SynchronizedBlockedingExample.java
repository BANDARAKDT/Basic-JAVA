

public class SynchronizedBlockedingExample {
    public static void main(String[] args) {
        Object lock=new Object();
        Thread syThread=new Thread(new SyncThread(lock));
        SyncThread.start();

        
        
        try{
            Thread.sleep(2000);

    }catch(InterruptedException e){
        e.printStackTrace();
    }
    }
    synchronized(lock){
        lock.notify();
    }
}
