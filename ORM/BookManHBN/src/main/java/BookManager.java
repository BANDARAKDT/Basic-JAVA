import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BookManager {
    protected SessionFactory factory;

    //code to load Hibernate session factory
    protected void setup(){
        final StandardServiceRegistry registry = new
                StandardServiceRegistryBuilder()
                .configure() //configures settings from hibernate.cfg.xml file
                .build();

        try {
            factory = new MetadataSources(registry).buildMetadata()
                    .buildSessionFactory();
        }catch (Exception ex){
            StandardServiceRegistryBuilder.destroy(registry);
        }

    }

    //code to close Hibernate session factory
    protected void exit(){ factory.close();}

    //save a book
    protected void create(){
        Book NewBook = new Book();
        NewBook.setTitle("ABC");
        NewBook.setPrice(10.25F);
        NewBook.setAuthor("XYZ");

        Session session = factory.openSession();
        session.beginTransaction();

        session.persist(NewBook);

        session.getTransaction().commit();

        session.close();
    }

    //get a book
    protected void read(){
        Session session = factory.openSession();

        Integer bookId = 1;

        Book book = session.get(Book.class,bookId);

        System.out.println("Title: "+book.getTitle());
        System.out.println("Author: "+book.getAuthor());
        System.out.println("Price: "+book.getPrice());

        session.close();
    }

    //modify a book

    protected void update(){
        Book NewBook = new Book();
        NewBook.setId(2);
        NewBook.setTitle("PQR");
        NewBook.setPrice(12.55F);
        NewBook.setAuthor("abc");

        Session session = factory.openSession();
        session.beginTransaction();

        session.merge(NewBook);

        session.getTransaction().commit();
        session.close();
    }

    //remove a book
    protected void delete(){
        Book dltBook = new Book();
        dltBook.setId(2);

        Session session = factory.openSession();
        session.beginTransaction();

        session.remove(dltBook);

        session.getTransaction().commit();
        session.close();
    }

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        manager.setup();

        //manager.create();
       // manager.read();
       // manager.update();
        manager.delete();
        manager.exit();
    }
}
