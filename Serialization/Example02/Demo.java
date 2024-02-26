package Example02;

import java.io.Serializable;

public class Demo implements Serializable {
    public int a;
    public String b;

    //default constructor

    public Demo(int a, String b){
        this.a=a;
        this.b=b;
        
    }
}
