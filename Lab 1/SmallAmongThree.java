// WAP to find smallest among three numbers.
import java.util.Scanner;
public class SmallAmongThree {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter three numbers: ");
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    if(a<b&&a<c)
    {
        System.out.println("The smallest number is " +a);
    }
    else if(b<c)
    {
        System.out.println("The smallest number is " +b);
    }
    else
    {
        System.out.print("The smallest number is " +c);
    }
    }
}
