package Example01;

public class CountDownTimer extends Thread{
    //1. create class
    //2.extends Thread class
    //3.overide run method


@Override
    public void run(){
            for(int t=20;t>=0;t--){
                System.out.println("T minus "+t);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                   System.out.println("Exeption occured"+ e.getMessage());
                }
            }
    }
 




}
