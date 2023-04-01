// WAP to find area of circle. Use pi as constant.
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float radius,area;
    final float PI = 3.14f;
    System.out.println("Enter radius of circle: ");
    radius = input.nextFloat();
    area = PI*radius*radius;
    System.out.println("The area of the circle is " + area);
    }
}
