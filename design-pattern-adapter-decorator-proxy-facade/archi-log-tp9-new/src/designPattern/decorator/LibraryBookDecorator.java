package designPattern.decorator;
import java.time.LocalDate;

import designPattern.Book;

// Décorateur pour ajouter des fonctionnalités de bibliothèque
public class LibraryBookDecorator implements BookDecorator {
    private Book book;
    private boolean isLoaned; // prêt en cours ou non
    private LocalDate date; // date de prêt

    public LibraryBookDecorator(Book book) {
        this.book = book;
    }

    // définit un prêt. isLoaned de vient vrai, et on fournit la date du prêt
    public void loanOut(LocalDate dueDate) {
    	this.date = dueDate;
    	this.isLoaned = true;
    }

    // Le livre a été ramené, fin du prêt
    public void returnBook() {
    	this.isLoaned = false;
    }

    public boolean isLoanedOut() {
        return isLoaned ;
    }

    public LocalDate getDueDate() { 	
        return date;
    }

    // Implémentation des méthodes héritées de Book
    public void setTitle(String title) {
    	book.setTitle(title);
    }
    
    public void setPrice(double price) {
    	book.setPrice(price);
    }
    
    public String getTitle() {
    	return book.getTitle();
    }
    
    public double getPrice() {
    	return book.getPrice();
    }
    
    public String preview() {
    	
    	return book.preview();
    }
    
    public String toString ()
    {
        return book.getTitle() + (isLoanedOut() ? " has been loaned. Due date: " + getDueDate() : " is available for a loan.");
    }
}