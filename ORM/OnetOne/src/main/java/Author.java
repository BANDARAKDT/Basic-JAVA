import jakarta.persistence.*;

@Entity
@Table(name = "author")
public class Author {
    private Integer id;
    private String name;
    private String email;

    public Author(){}

    public Author(String name, String email){

        this.email=email;
        this.name=name;

    }

    @Id
    @Column(name = "author_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
