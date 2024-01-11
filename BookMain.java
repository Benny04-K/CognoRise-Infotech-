package Books;

public class BookMain {
	    public static void main(String[] args) {
	        // Create a LibraryCatalog
	        LibraryCatalog libraryCatalog = new LibraryCatalog();

	        // Add some books to the catalog
	        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
	        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
	        Book book3 = new Book("1984", "George Orwell");

	        libraryCatalog.addBook(book1);
	        libraryCatalog.addBook(book2);
	        libraryCatalog.addBook(book3);

	        // Display the initial catalog
	        System.out.println("Initial Library Catalog:");
	        libraryCatalog.displayCatalog();

	        // Check out a book
	        System.out.println("\nChecking out 'The Catcher in the Rye'...");
	        libraryCatalog.checkOutBook("The Catcher in the Rye");
	        libraryCatalog.displayCatalog();

	        // Return a book
	        System.out.println("\nReturning 'The Catcher in the Rye'...");
	        libraryCatalog.returnBook("The Catcher in the Rye");
	        libraryCatalog.displayCatalog();
	    }
	
}

