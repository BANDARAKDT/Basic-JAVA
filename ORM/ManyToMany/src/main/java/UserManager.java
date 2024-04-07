import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class UserManager {

    public static void main(String[] args) {
        //loads configuration and mappings
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

        //builds a session factory from the service registry
        try {
            SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();

            Group groupAdmin = new Group("Administrator Group");
            Group groupGuest = new Group("Guest Group");

            User user1 = new User("Tom", "tomcat", "tom@codejava.net");
            User user2 = new User("Mary", "mary", "mary@codejava.net");

            groupAdmin.addUser(user1);
            groupAdmin.addUser(user2);

            groupGuest.addUser(user1);

            user1.addGroup(groupAdmin);
            user2.addGroup(groupAdmin);
            user1.addGroup(groupGuest);

            session.persist(groupAdmin);
            session.persist(groupGuest);

            session.getTransaction().commit();

            session.close();
            factory.close();

        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
