ThreadingLesson


public class MyRun extends Thread{
    public void run(){
        for(int i;i<=20;i+=2){
            System.out.println(i);

            Thread.sleep(300);

        }
    }
    
}

public class MyRunnable{
    public static void main(String args[]){
        Thread thread=new Thread(new MyRun());
        thread.start();
    }
}
