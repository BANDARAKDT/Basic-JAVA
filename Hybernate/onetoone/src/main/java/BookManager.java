import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Date;

public class BookManager {

    protected SessionFactory factory;

    protected void setup() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        try {
            factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);


        }
    }
    protected void exit(){

        factory.close();
    }

    protected void create(){
        Book newBook=new Book();
        newBook.setTitle("Madolduuwa");
        newBook.setDescription("what a amazing book");
        newBook.setPublished(new Date());

        //subclass of section factry and do database manupulation through session
        Session session=factory.openSession();
        session.beginTransaction();

        //to save new book details
        session.persist(newBook);
        //after have to commit
        session.getTransaction().commit();
        session.close();

        newBook.setAuthor(new Author("john doe","john@gmail.com"));

        session.persist(newBook);

        Integer bookId=2;
        Book book= session.get(Book.class,bookId);
        System.out.println("Book title :"+book.getTitle());
        System.out.println("Date :"+book.getPublished());

        System.out.println("Author  name:"+book.getAuthor().getName());
        System.out.println("Auther email :"+book.getAuthor().getEmail());

        session.getTransaction().commit();
        session.close();


    }

    public static void main(String[] args) {
        Book bk=new Book();
    }
    }






