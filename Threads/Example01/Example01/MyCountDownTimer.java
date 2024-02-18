package Example01;



public class MyCountDownTimer implements Runnable{

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
           
     
    }}}
}
