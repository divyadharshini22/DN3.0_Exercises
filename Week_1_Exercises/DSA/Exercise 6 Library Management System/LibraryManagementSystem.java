public class LibraryManagementSystem {
    private Book[] books;

    public LibraryManagementSystem(Book[] books) {
        this.books = books;
    }

    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return null; // Book not found
    }

    // Main method for testing
    public static void main(String[] args) {
        // Sample book data
        Book[] books = {
                new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
                new Book(2, "1984", "George Orwell"),
                new Book(3, "To Kill a Mockingbird", "Harper Lee"),
                new Book(4, "The Catcher in the Rye", "J.D. Salinger"),
                new Book(5, "Pride and Prejudice", "Jane Austen")
        };

        LibraryManagementSystem library = new LibraryManagementSystem(books);

        String searchTitle = "1984";
        Book foundBook = library.linearSearchByTitle(searchTitle);
        System.out.println("Linear Search Result: " + (foundBook != null ? foundBook : "Book not found"));
        foundBook = library.binarySearchByTitle(searchTitle);
        System.out.println("Binary Search Result: " + (foundBook != null ? foundBook : "Book not found"));
    }
}

class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}
