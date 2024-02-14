public class Singleton{
    public static void main(String[] args) {
        A a1=A.getInstance();
   
        A a2=A.getInstance();
       
      
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