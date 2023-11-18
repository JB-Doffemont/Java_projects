package designPattern.facade;


import designPattern.IBook;
import designPattern.adapter.BookStoreAdapter;
import designPattern.adapter.IBookStore;
import designPattern.adapter.OldBookStore;
import designPattern.decorator.LibraryBookDecorator;

// Facade pour simplifier l'accès client
public class LibraryFacade {
    private IBookStore bookStoreAdapter;

    public LibraryFacade(OldBookStore oldBookStore) {
    	this.bookStoreAdapter = new BookStoreAdapter(oldBookStore);
    }


    // Méthodes simplifiées pour l'accès client
    public IBook getBook(String title) {
        // Logique pour obtenir un aperçu du livre
        return  bookStoreAdapter.fetchBook(title);
    }

    // Méthode qui renvoie un libraryBookDecorator
    public IBook libraryBook(String title) {
        
        return new LibraryBookDecorator(bookStoreAdapter.fetchBook(title));
    }
}