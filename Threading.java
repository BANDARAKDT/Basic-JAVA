public class Threading extends Thread {
    public void run(){
        System.out.println("Thrad is running");

    }
public static void main(String[] args) {
    Threading obj=new Threading();
    obj.start();
}
}
