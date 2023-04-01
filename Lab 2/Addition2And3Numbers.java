/* Write a program which has two functions with same name, one for addition of two
   integers and other for addition of three integers.*/
import java.util.Scanner;

class Addition {
        void add(int a,int b,int c){
        System.out.println("Sum is :"+(a+b+c));
    }
        void add(int a,int b){
        System.out.println("Sum is :"+(a+b));
    }
}
    public class Addition2And3Numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        Addition object = new Addition();
        object.add(sc.nextInt(), sc.nextInt());
        System.out.println("Enter three numbers :"); 
        object.add(sc.nextInt(), sc.nextInt(), sc.nextInt());
        sc.close();
    }
}