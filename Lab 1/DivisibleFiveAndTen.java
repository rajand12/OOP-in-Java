// WAP to check whether check whether a number is exactly divisible by 5 and 10.
import java.util.Scanner;
public class DivisibleFiveAndTen {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a;
    System.out.println("Enter a number: ");
    a = input.nextInt();
    if(a%10==0)
    {
        System.out.println(a + " is divisible by 5 and 10.");
    }
    else if(a%5==0 && a%10!=0)
    {
        System.out.println(a + " is divisible by 5 but not divisible by 10.");
    }
    else{
        System.out.println(a + " is not divisible by 5 and 10.");
    }
    }
}
