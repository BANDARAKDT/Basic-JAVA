public class SaticVari {
    int x;
    static int y;
    static void meth1(){
        System.out.println("this is a non-static method");
    }

    static void meth2(){
            System.out.println("this is a static method");

             
    }
    public static void main(String args[]){
           System.out.println("this is main method");
           System.out.println("Y variable value is "+y);
        
           SaticVari obj1=new SaticVari();
           SaticVari.meth1();
        y=5;
            meth2();




    }
}
