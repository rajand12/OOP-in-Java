// WAP to find sum of two numbers.
import java.util.Scanner;
public class SumTwoNumbers {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1,num2,result;
    System.out.println("Enter two numbers: ");
    num1 = input.nextInt();
    num2 = input.nextInt();
    result = num1 + num2;
    System.out.println("The sum of the given numbers is " + result);
    }
}
