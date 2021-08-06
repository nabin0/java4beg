package Exercises;

class Library {
    String[] books;
    int noofBooks = 0;
    // String[] issuedBooks;

    public Library() {
        this.books = new String[100];
        this.noofBooks = 0;
    }

    void addBook(String book) {
        System.out.println("------------- Adding Book... -------------");
        this.books[noofBooks + 1] = book;
        noofBooks++;
        System.out.println(book + " is added to the library.");
    }

    void showBook() {
        System.out.println("------------- Available Books...-------------");

        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                continue;
            } else {
                System.out.println("* " + books[i]);
            }
        }
    }

    void issueBook(String bookname) {
        System.out.println("------------- Issuing Book...-------------");
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                continue;
            }
            if (this.books[i].equals(bookname)) {
                System.out.println(bookname + " book is issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("No such book is available.");
    }

    void returnBook(String str) {
        System.out.println("------------- Returning Book...-------------");
        addBook(str);
        System.out.println("Thanks for returning the book");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        String[] books = { "math", "science", "gk" };
        Library obj = new Library();

        for (String book : books) {
            obj.addBook(book);
        }
        obj.showBook();
        obj.addBook("Engineering Mathematics");
        obj.issueBook("gk");
        obj.issueBook("gk");
        obj.showBook();
    }
}