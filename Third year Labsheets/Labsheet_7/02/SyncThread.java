

public class SyncThread implements Runnable{

    @Override
    public void run() {
        synchronized(lock){
            try{
                lock.wait();
                System.out.println("thread resumed after waiting on lock");
            } catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }
    
}
