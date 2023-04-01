// WAP to find largest among three numbers.
import java.util.Scanner;
public class LargeAmongThree {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter three numbers: ");
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    if(a>b&&a>c)
    {
        System.out.println("The largest number is " +a);
    }
    else if(b>c)
    {
        System.out.println("The largest number is " +b);
    }
    else
    {
        System.out.print("The largest number is " +c);
    }
    }
}
