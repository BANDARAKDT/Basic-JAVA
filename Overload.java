public class Overload {
    static int plusMethodInt(int x,int y){
        return x+y;

    }

    static double plusMethodDouble(double x,double y){
        return x+y;
    }

    public static void main(String[] args) {
        int muNum1=plusMethodInt(8, 5)
        double myNum2=plusMethodDouble(4.3,myNum1);
        System.out.println("double:"+myNum2);
    
    }
}
