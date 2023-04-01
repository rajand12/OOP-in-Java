/* Write a program which has two functions with same name and same number of
  arguments, one for addition of two integers and other for addition of two double
  values.*/

import java.util.Scanner;
class Add {
        void addition(int a, int b) {
        System.out.println("The sum is : " + (a + b));
    }

        void addition(double a, double b) {
        System.out.println("The sum is : " + (a + b));
    }
}

    public class Addition2IntegerAndDouble{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        Add object = new Add();
        object.addition(sc.nextInt(), sc.nextInt());
        System.out.println("Enter two double floating point numbers:");
        object.addition(sc.nextDouble(), sc.nextDouble());
        sc.close();
    }
}