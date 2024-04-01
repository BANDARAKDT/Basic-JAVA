import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Book {
    private int bookId;
    private String title;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    private String author;
    private String ISBN;


        // Attributes and methods

        public static void searchBookByTitle(String title) {
            try (Connection connection = DatabaseConnector.getConnection();
                 PreparedStatement statement = connection.prepareStatement("SELECT * FROM Books WHERE title LIKE ?")) {
                statement.setString(1, "%" + title + "%");
                ResultSet resultSet = statement.executeQuery();
                // Process ResultSet
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Other methods for database interaction
    }


