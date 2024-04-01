import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javax.persistence.*;


public class TestUser {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        User user1 = new User();
        user1.setEmail("taylor@gmail.com");
        user1.setFullname("Taylor Swift");
        user1.setPassword("12345");

        entityManager.persist(user1);

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
    }
}
