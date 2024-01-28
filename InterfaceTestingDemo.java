public class InterfaceTestingDemo implements InterfaceTesting {
    public void eat(){
        System.out.printl("eating");
    }

    public void drink(){

    }

    public void run(){

    }

    public static void main(String args[]){
        InterfaceTestingDemo x=new InterfaceTesting();
        System.out.printl(x.drink);
    }

}
