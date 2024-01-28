import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File obj=new File("file.txt");

        try{
         //   System.out.println(obj.createNewFile());
            System.out.println(obj.getName());
            System.out.println(obj.exists());

        }catch(Exception e){
            System.out.println(e);

        }
    }
}
