import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.HashSet;
import java.util.Set;

public class StockManager {
    public static void main(String[] args) {
        //loads configuration and mappings
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

        //builds a session factory from the service registry
        try {
            SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();

            Category category = new Category("Computer");

            Product pc = new Product("Dell","Quad Core PC",1200,category);
            Product laptop = new Product("MacBook","Apple Laptop", 2100, category);
            Product phone = new Product("iPhone SE", "Apple Best Selling smartphone",599,category);
            Product tablet = new Product("iPad Air", "Apple tablet", 1099, category);

            Set<Product> products = new HashSet<>();
            products.add(pc);
            products.add(laptop);
            products.add(phone);
            products.add(tablet);

            category.setProducts(products);

            session.persist(category);

            session.getTransaction().commit();

            session.close();
            factory.close();

        }catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
