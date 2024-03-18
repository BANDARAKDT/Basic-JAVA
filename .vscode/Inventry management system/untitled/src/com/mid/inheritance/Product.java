package Labsheet10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class InventoryManager implements Serializable{
    Product product;
    List<Product> list = new ArrayList<>();

    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();

        //add products
        inventoryManager.addProduct("Laptop",1001,10);
        inventoryManager.addProduct("Mobile",1002,15);

        //display inventory
        System.out.println("\nCurrent inventory");
        inventoryManager.displayInventory();

        //update product
        inventoryManager.updateProductQuantity(1001,5);

        //display updated inventory
        System.out.println("\nUpdated inventory");
        inventoryManager.displayInventory();

        //remove product
        inventoryManager.removeProduct(1002);

        //updated invertory
        System.out.println("\nCurrent inventory");
        inventoryManager.displayInventory();

        //add new product
        inventoryManager.addProduct("Tab",1003,25);

        //serialization and deserialization
        inventoryManager.serializeInventory("products.ser");
        inventoryManager.deserializeInventory("products.ser");

    }

    private void removeProduct(int id) {
        System.out.println("\nRemoving product : id - "+id);
        Product productRemove = null;
        for(Product product:list){
            if(product.id==id){
                list.remove(product);
                break;
            }
        }
    }

    private void updateProductQuantity(int id, int quantity) {

        for(Product product1:list){
            if(product1.id==id){
                product1.quantity=quantity;
            }
        }
    }

    void displayInventory(){
        //System.out.println("\nCurrent inventory");
        for(Product product1:list){
            System.out.println("Product : "+product1.name+", ID : "+product1.id+", Quantity : "+product1.quantity);
        }
    }

    void serializeInventory(String fileName){

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(list);

            System.out.println("\nSerialized !");
            fileOutputStream.close();
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void deserializeInventory(String fileName){
        try {
            List<Product> deList = new ArrayList<>();
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            deList = (List<Product>) objectInputStream.readObject();
            System.out.println("\nDeserialized !");

            for(Product product1:deList){
                System.out.println("deProduct : "+product1.name+", ID : "+product1.id+", Quantity : "+product1.quantity);
            }
            fileInputStream.close();
            objectInputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    void addProduct(String name, int id, int quantity){
        Product product = new Product(name,id,quantity);
        list.add(product);
    }
}

public class Product implements Serializable{
    String name;
    int id;
    int quantity;


    public Product(String name, int id, int quantity) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }
}
