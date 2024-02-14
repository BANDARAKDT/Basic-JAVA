public class Singleton{
    public static void main(String[] args) {
       A a1=A.getInstance();
       
       a1.age=20;

       System.out.println(a1.age);

       A a2=A.getInstance();

       a2.age=50;
    }
}

class A{
    int age=10;

    private static A a= new A();

    private A(){

    }

public static A getInstance(){
    return a;
}
public int getAge(){
    return age;
}

}