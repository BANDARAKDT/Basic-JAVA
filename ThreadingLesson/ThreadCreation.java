package ThreadingLesson;

public class ThreadCreation extends Thread {
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);

            Thread.sleep(500);

        }
    }

}
public class ThreadCreation{
    public static void main(String args[]){
        MyThread T=new MyThread();
        T.start();
    }
}
