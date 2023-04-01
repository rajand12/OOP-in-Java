// WAP to check whether a number is odd or even.
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a;
    System.out.println("Enter a number: ");
    a = input.nextInt();
    if(a%2==0)
    {
        System.out.println(a + " is an even number.");
    }
    else
    {
        System.out.println(a + " is an odd number.");
    }
    }
}
