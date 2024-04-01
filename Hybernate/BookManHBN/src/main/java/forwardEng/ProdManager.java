package forwardEng;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ProdManager {
    public static void main(String[] args) {
        final StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();

        try {
            SessionFactory factory=new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session=factory.openSession();
            session.beginTransaction();

            Products products=new Products();
            products.setName("iPhone");
            products.setPrice(45.021F);
            products.setEnabled(true);
            products.setDescription("a good product");
            session.persist(products);
            session.getTransaction().commit();
            session.close();
            factory.close();

        }catch (Exception e){
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
