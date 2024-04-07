import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class BookManager {
    public static void main(String[] args) {
        //load configurations and mappings
        final StandardServiceRegistry registry = new
                StandardServiceRegistryBuilder().configure().build();

        //builds a session factory from the service registry

        SessionFactory factory = new MetadataSources(registry).buildMetadata()
                .buildSessionFactory();


        Session session = factory.openSession();
        session.beginTransaction();

        //create a book entity
//        Book newBook = new Book();
//        newBook.setTitle("Hibernate");
//        newBook.setDescription("A good book to learn Hibernate");
//        newBook.setPublishedDate(new Date());
//
//        newBook.setAuthor(new Author("Jane Doe", "jane@yahoo.com"));
//
//        //save the book details
//        session.persist(newBook);

        //read the book details
//        Integer bookId = 2;
//        Book book = session.get(Book.class, bookId);
//        System.out.println("Book Title: "+book.getTitle());
//        System.out.println("Date: "+book.getPublishedDate());
//
//        System.out.println("Author Name: "+book.getAuthor().getName());
//        System.out.println("Author Email: "+book.getAuthor().getEmail());
        Book newBook = new Book();
        newBook.setId(3);
        session.remove(newBook);

        session.getTransaction().commit();
        session.close();


    }

}
