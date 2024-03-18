package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface BookstoreService extends Remote {
    List<Book> searchBooks(String keyword) throws RemoteException;
    boolean buyBook(int bookId, int quantity) throws RemoteException;
}
