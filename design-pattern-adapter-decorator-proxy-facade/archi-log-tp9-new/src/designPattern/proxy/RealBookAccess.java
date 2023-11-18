package designPattern.proxy;

import designPattern.Book;

// Classe réelle
public class RealBookAccess implements BookAccess {
    private Book book;

    public RealBookAccess(Book book) {
    	this.book = book;
    }

    @Override
    public String read() {
    	return "Reading: " + book.getTitle();
    }

    public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
    public String preview() {
    	System.out.println("Preview of Clean Code: [First few lines of the book...]");
        return null ;
    }

}
