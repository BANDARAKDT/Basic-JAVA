import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "CATEGORY")
public class Category {

    private float id;
    private String name;

    private Set<Product> products;


    public Category(){}
    public Category(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
