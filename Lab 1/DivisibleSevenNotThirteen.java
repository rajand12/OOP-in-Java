// WAP to check whether check whether a number is divisible by 7 but not by 13.
import java.util.Scanner;
public class DivisibleSevenNotThirteen {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a;
    System.out.println("Enter a number: ");
    a = input.nextInt();
    if(a%7==0 && a%13!=0)
    {
        System.out.println(a + " is divisible by 7 but not divisible by 13.");
    }
    else if (a%7!=0 && a%13==0)
    {
        System.out.println(a + " is not divisible by 7 but divisible by 13.");
    }
    else if(a%7==0 && a%13==0){
        System.out.println(a + " is divisible by 7 and 13.");
    }
    else
    {
        System.out.println(a + " is not divisible by 7 and 13.");
    }
    }
}
