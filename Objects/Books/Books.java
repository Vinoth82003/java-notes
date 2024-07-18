package Objects.Books;

public class Books {

    int book_id;
    String book_name;
    String book_author;
    Double book_price;

    public Books(int book_id, String book_name, String book_author, Double book_price){

        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_price = book_price;
    
    }

    public void displayBooks(){
        System.out.println("******************** Welcome to book store ***************************");
        System.out.println("Book ID: "+book_id);
        System.out.println("Book Name: "+book_name);
        System.out.println("Book Author: "+book_author);
        System.out.println("Book Price: "+book_price+"$");
        System.out.println("************************************************************************");
    }
}
