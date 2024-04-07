import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "book")
public class Book {
    private Integer id;
    private String title;
    private String description;
    private Date publishedDate;
    private Author author;

    public Book(){}

    @Id
    @Column(name = "book_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Temporal(TemporalType.DATE)
    @Column(name = "published")
    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_fk")
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
