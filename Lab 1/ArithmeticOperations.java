// WAP to add, subtract, multiply and divide two numbers.
import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1,num2,sum,diff,prod;
    float div;
    System.out.println("Enter two numbers: ");
    num1 = input.nextInt();
    num2 = input.nextInt();
    sum = num1 + num2;
    diff = num1 - num2;
    prod = num1 * num2;
    div = (float)num1/num2;
    System.out.println("The sum of given numbers is " +sum);
    System.out.println("The difference of given numbers is " +diff);
    System.out.println("The product of given numbers is " +prod);
    System.out.println("The division of given numbers is " +div);
    }
}
