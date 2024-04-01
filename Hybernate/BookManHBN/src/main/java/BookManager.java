import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;

public class BookManager {

protected SessionFactory factory;

//load configuration file and establish mapping and checkng this things  happenning correct


    //code to load hibernate session factory
    protected void setup(){
        final StandardServiceRegistry registry= new StandardServiceRegistryBuilder()
                .configure()   //configure settings form hibernate.cfg.xml
                .build();

        try {
            factory=new MetadataSources(registry).buildMetadata().buildSessionFactory();

        }catch (Exception e){
            StandardServiceRegistryBuilder.destroy(registry);
        }


    }

    //code to close hibernate session factory
    protected void exit(){
factory.close();
    }


    //
    protected void create(){
        Book newBook=new Book();
        newBook.setTitle("Madolduuwa");
        newBook.setPrice(1200.00F);
        newBook.setAuther("MW");

        //subclass of section factry and do database manupulation through session
        Session session=factory.openSession();
        session.beginTransaction();

        //to save new book details
        session.persist(newBook);
        //after have to commit
        session.getTransaction().commit();
        session.close();
    }

    protected void update(){
        Book newBook=new Book();
        newBook.setId(2);
        newBook.setTitle("Senkottan");
        newBook.setPrice(12.00F);
        newBook.setAuther("MRM");

        //subclass of section factry and do database manupulation through session
        Session session=factory.openSession();
        session.beginTransaction();

            session.merge(newBook);
            session.getTransaction().commit();
            session.close();
    }

    protected void read(){
        Session session=factory.openSession();
        Integer bookId=1;
        Book book=session.get(Book.class,bookId);
        System.out.println("Title :"+book.getTitle());
        System.out.println("Author :"+book.getAuther());
        System.out.println("Price :"+book.getPrice());


    }


    protected void delete(){

        Book dlt=new Book();
        dlt.setId(2);
        Session session=factory.openSession();
        session.beginTransaction();
         session.remove(dlt);

         session.getTransaction().commit();
         session.close();

    }

    public static void main(String[] args) {
                    BookManager manager=new BookManager();
                    manager.setup();
                    //manager.create();
                    //manager.read();
                    //manager.update();
        manager.delete();
                    manager.exit();
    }

}
