package ThreadingLesson;

public class Sync extends Thread{
    public void run(){
        synchronized(this){
            for(int i=2;i<=10;i+=2){
                System.out.println(i);
            }
        }

        synchronized(this){
            for (int j =1;j<=10;j+=2) {
                System.out.println(j);
            }
        }
    }
    
}

public class Sync{
    public static void main(String args[]){
        MySync obj=new MySync();
        obj.start();
    }

}
