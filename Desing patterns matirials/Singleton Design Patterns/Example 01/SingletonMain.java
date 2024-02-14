public class SingletonMain{
    public static void main(String[] args) {
        A a1=new A();
   
        A a2=new A();
       
      
    }
}

class A{
private static A a=new A();

private A(){

}

public static A getInstance(){
    return a; 
}
}