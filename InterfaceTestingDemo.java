public class InterfaceTestingDemo implements InterfaceTesting {
    public void eat(){
        System.out.println("eating");
    }

    public void drink(){
        System.out.println("drinking");
       
    }

    public void run(){
        System.out.println("running");
    }

    public static void main(String args[]){
        InterfaceTestingDemo x=new InterfaceTestingDemo();
        System.out.println();
    }

}
