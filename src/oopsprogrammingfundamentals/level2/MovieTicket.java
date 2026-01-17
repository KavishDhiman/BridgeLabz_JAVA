package oopsprogrammingfundamentals.level2;
/*
 * Problem Statement:
 * Write a Java program to create a MovieTicket class to book a ticket
 * and display ticket details.
 */

/*
 * Class Name: MovieTicket
 *
 * Description:
 * This class represents a movie ticket with attributes such as
 * movie name, seat number, and price. It provides methods to book
 * a ticket and display ticket details.
 */

// MovieTicket class represents a movie ticket
public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    // book ticket
    void bookTicket(int seat, double cost) {
        seatNumber = seat;
        price = cost;
    }
    // display the ticket
    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat No: " + seatNumber);
        System.out.println("Price: " + price);
    }
    // main method
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.movieName = "Inception";

        ticket.bookTicket(15, 250);
        ticket.displayTicket();
    }
}
