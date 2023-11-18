package designPattern;

// Classe Book
public class Book implements IBook {
    private String title;
    private double price;

    public Book (String title, double price)
    {
        //TODO à compléter
    	this.title = title;
    	this.price = price;
    }
    // getters, setters, etc.
    public String getTitle() {
    	return title;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public double getPrice() {
    	return price;
    }
    
    public void setPrice(double price) {
    	this.price = price;
    }

    //TODO à compléter

    public String preview() {
        // Simule l'affichage d'un aperçu du livre (indiquez par exemple "Preview of Clean Code: [First few lines of the book...]")
    	System.out.println("Preview of Clean Code: [First few lines of the book...]");
        return null;
    }
}