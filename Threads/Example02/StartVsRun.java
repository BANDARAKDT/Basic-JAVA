public class StartVsRun {
    
    public static void main(String[] args) {
        Thread thread1=new Mythread();
        Thread thread2=new Mythread();

thread1.setName("T1");
thread2.setName("T2");

thread1.setPriority(4);
thread2.setPriority(Thread.MAX_PRIORITY);

       
        thread1.start();
        thread2.start();    //cant call start twise it will give u asn error
    }
}
