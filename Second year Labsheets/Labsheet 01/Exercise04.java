public class Exercise04 {

    int x;
    int y;
    int result;

    public void meth1(int x,int y){
       
        result=x+y/3;
        System.out.println("method one result is........."+result);

    }

    public void meth2(int x, int y){
        
        result=(y%x)+1;
        System.out.println("method two result is............"+result);

    }

    public void meth3(){
       x=3;
       y=x+3;
        result=(result+=y-x);
        System.out.println("method three result is............"+result);

    }

    public static void main(String[] args) {
        Exercise04 ex4=new Exercise04();
        ex4.meth1(10, 3);
        ex4.meth2(3, 57);
        ex4.meth3();
    }
    
}
