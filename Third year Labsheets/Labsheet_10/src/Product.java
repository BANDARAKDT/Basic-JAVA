import java.io.Serializable;

public class Product implements Serializable {
  private static final long serialVersionUID=1L;



    public String name;
    public int id;
    public int quantity;

public Product(String name,int id,int quantity){
    this.name=name;
    this.id=id;
    this.quantity=quantity;


}public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
