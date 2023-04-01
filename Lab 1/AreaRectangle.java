// WAP to find area of a rectangle.
import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int l,b,area;
    System.out.println("Enter length and breadth of rectangle: ");
    l = input.nextInt();
    b = input.nextInt();
    area = l*b;
    System.out.println("The area of the recatangle is " + area);
    }
}
