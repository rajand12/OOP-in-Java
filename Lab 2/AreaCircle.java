/* Write a program to define a class Circle with its data members pi and r and members
   functions getdata() for initializing data members and calculate() for finding area of
   circle. Return result from calculate() and display result in main() function. Use pi
   as constant. */

import java.util.Scanner;
class Circle {
    private final float pi = 3.1415f;
    private float r;
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        r = sc.nextFloat();
        sc.close();
    }
    float calculate() {
        return pi * r * r;
    }
}
    public class AreaCircle{
    public static void main(String[] args) {
        Circle newCircle = new Circle ();
        newCircle.getData();
        System.out.println("The area is :" + newCircle.calculate());
    }
}

    

