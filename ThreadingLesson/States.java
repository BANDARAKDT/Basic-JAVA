package ThreadingLesson;
public class StatesThread extends Thread{
    public void run(){
        System.out.println("Thread state: new");
        System.out.println("thread state: runnable");
        System.out.println("thread state: running");
    }
    
}


public class states{
    public static void main(String[] args) {
        StatesThread obj=new StatesThread();
        obj.start();


        System.out.println("thread state terminated");
    }
}