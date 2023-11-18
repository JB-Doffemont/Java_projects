package designPattern.proxy;

import designPattern.Book;

// Classe proxy
public class ProxyBookAccess implements BookAccess {
    private RealBookAccess realBookAccess;
    private boolean hasPurchased;

    public ProxyBookAccess(Book book) {
    	this.realBookAccess = new RealBookAccess(book);
    }

    public void purchase() {
        this.hasPurchased = true;
    }

    @Override
    public String read() {
        // Dans un Proxy, si le livre a été acheté, on autorise la lecture, sinon on indique à l'utilisateur qu'il doit acheter le livre
    	if (this.hasPurchased == true) {
    		return realBookAccess.read();
    	} else {
    		return "Please purchase the book to read.";
    	}
    }

    @Override
    public String preview() {
    	System.out.println(realBookAccess.preview());
        return null ;
    }

}