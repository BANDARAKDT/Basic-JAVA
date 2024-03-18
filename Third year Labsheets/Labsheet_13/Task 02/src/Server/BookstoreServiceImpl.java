package server;

import common.Book;
import common.BookstoreService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class BookstoreServiceImpl extends UnicastRemoteObject implements BookstoreService {

    protected BookstoreServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public List<Book> searchBooks(String keyword) throws RemoteException {
        // Implement search logic here
        return new ArrayList<>();
    }

    @Override
    public boolean buyBook(int bookId, int quantity) throws RemoteException {
        // Implement buy logic here
        return false;
    }
}
