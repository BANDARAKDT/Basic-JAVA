package forwardEng;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Products {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name",length = 125)
    private String name;

    @Column(name="price",precision = 10)
    private float price;

    @Column(name="enabled",columnDefinition = "tinyint default 1")
    private boolean enabled;

    @Column(name = "description",length = 512)
    private String description;

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}
