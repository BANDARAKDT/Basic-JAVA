package forwardENG;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ProdManager {
    public static void main(String[] args) {

    final StandardServiceRegistry registry = new
            StandardServiceRegistryBuilder()
            .configure() //configures settings from hibernate.cfg.xml file
            .build();

    try {
        SessionFactory factory = new MetadataSources(registry)
                .buildMetadata().buildSessionFactory();

        Session session=factory.openSession();
        session.beginTransaction();

        Product product = new Product();
        product.setName("iPhone");
        product.setDescription("A good smartphone");
        product.setPrice(45.65F);
        product.setEnabled(true);

        session.persist(product);

        session.getTransaction().commit();

        session.close();
        factory.close();

    }catch (Exception ex){
        System.out.println(ex.getMessage());
        StandardServiceRegistryBuilder.destroy(registry);
    }
    }
}
