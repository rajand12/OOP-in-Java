// WAP to find simple interest.
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int p,t;
    float r,si;
    System.out.println("Enter principal and time: ");
    p = input.nextInt();
    t = input.nextInt();
    System.out.println("Enter rate: ");
    r = input.nextFloat();
    si = (float)(p*t*r)/100;
    System.out.println("The simple interest is " + si);
    }
}
