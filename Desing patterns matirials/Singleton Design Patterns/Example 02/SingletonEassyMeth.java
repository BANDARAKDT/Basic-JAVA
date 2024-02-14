easy method

public class SingletonEassyMeth {


    public static void main(String args[]){
            A a1=A.getInstance();

            A a2=A.getInstance();
    }
    
}


class A{
    private static A a;

    private A(){
       System.out.println("Instance created");

    }

    public static A getInstance(){
        if(a==null){
            a=new A();
        }
        return a;
    }
}