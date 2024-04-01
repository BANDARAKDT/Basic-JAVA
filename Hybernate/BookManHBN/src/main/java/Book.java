import jakarta.persistence.*;

@Entity                                                                                     //+++++++++++++  4



// database name is "book" but java class name is "Book" there for map as follows
@Table(name="book")                                                                         //+++++++++++++   5

public class Book {                                                                           //+++++++++++++1

    //map database


    private int id;                                                                         //+++++++++++++++2
    private String title;
    private String auther;
    private float price;


    @Id
    @Column(name="book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    public int getId() {                                                                   //++++++++++++  3   getters setters
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
