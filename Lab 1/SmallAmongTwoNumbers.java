// WAP to find smallest among two numbers.
import java.util.Scanner;
public class SmallAmongTwoNumbers {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a,b;
    System.out.println("Enter two numbers: ");
    a = input.nextInt();
    b = input.nextInt();
    if(a<b)
    {
        System.out.println("The smallest number is " +a);
    }
    else
    {
        System.out.println("The smallest number is " +b);
    }
    }
}
