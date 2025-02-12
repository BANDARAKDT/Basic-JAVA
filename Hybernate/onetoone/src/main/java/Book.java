import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="book")
public class Book {
    private long  id;
    private String title;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date published;


    @OneToOne
    @JoinColumn(name = "auther_id")

    private Author author;          //aggregation relation ship

    public Book(){

    }

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
