import Example01.MyCountDownTimer;

public class MyCountDownTimerDemo {
    
    public static void main(String[] args) {
        

    MyCountDownTimer mcdt=new MyCountDownTimer();
    Thread t=new Thread(mcdt);
    System.out.println("Launch the rocket with count down using single thrad");
    t.start();
}
}