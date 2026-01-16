package week2.Level1;

public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void display() {
        System.out.println(title + " | Available: " + available);
    }

    public static class Person {
        String name;
        int age;

        // Parameterized constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Copy constructor
        public Person(Person other) {
            this.name = other.name;
            this.age = other.age;
        }

        public void display() {
            System.out.println(name + " | Age: " + age);
        }
    }
}
