import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestUser {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        User user1 = new User();
        user1.setEmail("john@gmail.com");
        user1.setFullname("John Doe");
        user1.setPassword("john");

        entityManager.persist(user1);
        entityManager.getTransaction().commit();



        entityManager.close();
        factory.close();
    }
}
