package Task1;

public class Main {
    public static void main(String[] args) {
        Counter counter=new Counter();

        Thread incrementThread=new Thread();


        Thread decremenThread=new Thread();
            incrementThread.start();
            decremenThread.start();


            try {
                incrementThread.join();
                decremenThread.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("Final count value: "+counter.getCount());
          
    }




}
