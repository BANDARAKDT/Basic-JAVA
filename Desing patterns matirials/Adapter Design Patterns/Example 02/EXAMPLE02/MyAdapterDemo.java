package EXAMPLE02;

public class MyAdapterDemo{
public static void main(String[] args) {
    SimpleName simple=new SimpleName();
    simple.setName("dela");
    System.out.println("My simplename is "+ simple.getName());

    SimpleToComplexAdapter adapter=new SimpleToComplexAdapter(simple);
adapter.setfName(("deshani"));
    System.out.println("My firstname: "+adapter.getfName());
adapter.setlName("bandara");
    System.out.println("My lastNamme "+adapter.getlName());
}


}
