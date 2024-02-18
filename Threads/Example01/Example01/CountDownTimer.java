package Example01;

public class CountDownTimer extends Thread{
    //1. create class
    //2.extends Thread class
    //3.overide run method


@Override
    public void run(){
            for(int t=20;t>=0;t--){
                System.out.println("T minus "+t);
                if(t==16){
                    System.out.println("Flood the launch pad");

                }else if(t==6){
                    System.out.println("start the engines");

                }else if(t==0){
                    System.out.println("launch");
                }
               
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                   System.out.println("Exeption occured"+ e.getMessage());
                }
            }
    }
 




}
