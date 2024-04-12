import java.io.*;

class Demo implements java.io.Serializable {
    public int a;
    public String b;

    public Demo(int a,String b){
        this.a=a;
        this.b=b;

    }
}
 class Test{
     public static void main(String[] args) {
         Demo object=new Demo(100,"deshani");
         String filename="activity.ser";
         try{
             FileOutputStream file=new FileOutputStream(filename);
             ObjectOutput out=new ObjectOutputStream(file);
             out.writeObject(out);
             out.close();
             file.close();
             System.out.println("Object hast been serialized");
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
         Demo object1=null;
         try{
             FileInputStream file=new FileInputStream(filename);
             ObjectInputStream in=new ObjectInputStream(file);
             object1=(Demo)in.readObject();
             in.close();
             file.close();
             System.out.println("Object has been serialized");
             System.out.println("a= "+object1.a);
             System.out.println("b= "+object1.b);
         } catch (IOException | ClassNotFoundException e) {
             throw new RuntimeException(e);
         }
     }
 }