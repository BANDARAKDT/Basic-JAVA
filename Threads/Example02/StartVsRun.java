public class StartVsRun {
    
    public static void main(String[] args) {
        Thread thread1=new Mythread();
        Thread thread2=new Mythread();

        thread1.start();
        thread2.start();
    }
}
