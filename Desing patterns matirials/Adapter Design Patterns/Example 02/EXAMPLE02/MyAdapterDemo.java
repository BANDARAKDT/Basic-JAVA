package EXAMPLE02;

public class MyAdapterDemo{
public static void main(String[] args) {
    SimpleName simple=new SimpleName();
    simple.setName("dela");
    System.out.println("My simplename is "+ simple.getName());

    SimpleToComplexAdapter adapter=new SimpleToComplexAdapter(simple);
    System.out.println("My firstane: "+adapter.getfName());
    System.out.println("My firstane: "+adapter.getlName());
}


}
