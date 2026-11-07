class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book();

        Book b2 = new Book("Java Programming", "James Gosling", 500);

        Book b3 = new Book(b2);

        System.out.println("Book 1 (No-Argument Constructor):");
        b1.display();

        System.out.println("Book 2 (Parameterized Constructor):");
        b2.display();

        System.out.println("Book 3 (Copy Constructor):");
        b3.display();

        b3.price = 700;
        b3.title = "Advanced Java";

        System.out.println("After modifying copied object:");

        System.out.println("Original Book (b2):");
        b2.display();

        System.out.println("Copied Book (b3):");
        b3.display();
    }
}
