public class ThradingInterface implements Runnable{
    public void run(){
        System.out.println("This thread is create using Runnable Interface");
    }
    
}

public static void main(Strung[] args){
    Thread obj=new Thread(new ThradingInterface());
    obj.start();
}

