package Objects.Books;

import java.util.Scanner;

public class BookDriver {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        int book_id = sc.nextInt();
        System.out.print("Enter Book Name: ");
        String book_name = sc.next();
        System.out.print("Enter Book Author: ");
        String book_author = sc.next();
        System.out.print("Enter Book Price: ");
        Double book_price = sc.nextDouble();

        Books b1 = new Books(book_id, book_name, book_author, book_price);

        b1.displayBooks();

        sc.close();
    }
}
