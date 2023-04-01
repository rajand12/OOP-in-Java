/* 3.Write a program which has class Book with data members book_name, ISBN, author 
 and price and appropriate function members to read and display data members. */

import java.util.Scanner;

class Book{
    String book_name,author,dump;
    int price;
    long ISBN;
    void ReadData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of the book:");
        book_name = input.nextLine();
        System.out.println("Enter the price of the book: ");
        price = input.nextInt();
        System.out.println("Enter ISBN of the book: ");
        ISBN = input.nextInt();
        dump=input.nextLine();
        System.out.println("Enter Author Name: ");
        author = input.nextLine();
        input.close();        
    }
    void Display(){
        System.out.println("Your Book Details: ");
        System.out.println("Book name: "+book_name +"\nAuthor: "+author +"\nISBN: "+ISBN +"\nPrice "+price);
    }
}

public class BookDetails{
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.ReadData();
        b1.Display();
    }
}