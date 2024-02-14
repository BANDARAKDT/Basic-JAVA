public abstract class Cake{

    String name;
    String type;
    int price;

    public String getName(){
        return name;

    }
    public String gettype(){
        return type;

    }
    public int getprice(){
        return price;

    }

public void setName(String name){
    this.name=name;
}
public void settype(String type){
    this.type=type;
}
public void setprice(int price){
    this.price=price;
}

public abstract void recipe();

public abstract void myFans();

public void aboutCake(){
    System.out.println("I am"+name+"cake");
    System.out.println("My Fans:");
    myFans();
    System.out.println("you can get  a"+name+"cake at"+price);
}

}