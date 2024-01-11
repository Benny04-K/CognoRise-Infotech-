package Books;

	import java.util.ArrayList;

	// Book class with title, author, and status attributes
	public class Book {
	    private String title;
	    private String author;
	    private boolean checkedOut;

	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	        this.checkedOut = false; // Initially, the book is available
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public boolean isCheckedOut() {
	        return checkedOut;
	    }

	    public void checkOut() {
	        checkedOut = true;
	    }

	    public void returnBook() {
	        checkedOut = false;
	    }

	    @Override
	    public String toString() {
	        return "Book{" +
	                "title='" + title + '\'' +
	                ", author='" + author + '\'' +
	                ", checkedOut=" + checkedOut +
	                '}';
	    }
	}

	// LibraryCatalog class to manage books using ArrayList
	class LibraryCatalog {
	    private ArrayList<Book> books;

	    public LibraryCatalog() {
	        this.books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    public Book searchByTitle(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                return book;
	            }
	        }
	        return null; // Book not found
	    }

	    public ArrayList<Book> searchByAuthor(String author) {
	        ArrayList<Book> result = new ArrayList<>();
	        for (Book book : books) {
	            if (book.getAuthor().equalsIgnoreCase(author)) {
	                result.add(book);
	            }
	        }
	        return result; // Empty list if no books found
	    }

	    public boolean checkOutBook(String title) {
	        Book book = searchByTitle(title);
	        if (book != null && !book.isCheckedOut()) {
	            book.checkOut();
	            return true; // Book successfully checked out
	        }
	        return false; // Book not found or already checked out
	    }

	    public void returnBook(String title) {
	        Book book = searchByTitle(title);
	        if (book != null && book.isCheckedOut()) {
	            book.returnBook();
	        }
	    }

	    public void displayCatalog() {
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }
	}

	
