/* 1. Write a program to define a class with its data members and function members. Use 
   object of this class in main program to access its members.*/
import java.util.Scanner;
class Human{
    int id,contact;
    String name;
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your id: ");
        id = input.nextInt();
        System.out.println("Enter your contact: ");
        contact = input.nextInt();
        input.close();
    }
    void display(){
        System.out.print("Your name is "+ name + "\nContact Number is " + contact + "\nYour id is " +id );

    }
}

public class ClassMemberFunction {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.input();
        h1.display();
    }
    
}
