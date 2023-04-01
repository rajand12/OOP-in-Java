// WAP to check whether a number is divisible by 7 or not.
import java.util.Scanner;
public class DivisibleSeven {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a;
    System.out.println("Enter a number: ");
    a = input.nextInt();
    if(a%7==0)
    {
        System.out.println(a + " is divisible by 7.");
    }
    else
    {
        System.out.println(a + " is not divisible by 7.");
    }
    }
}
