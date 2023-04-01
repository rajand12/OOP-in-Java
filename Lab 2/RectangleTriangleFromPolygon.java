/* Create a class Polygon with data members: dimension1 and dimension2 and a
 member function: ReadDimension() to read data members. Derive two classes
 Rectangle and Triangle from Polygon class with appropriate member function to
 calculate area of each rectangle and triangle (multilevel).*/

import java.util.Scanner;
public class RectangleTriangleFromPolygon {
    public static void main(String[] args) {
        System.out.println("For rectangle");
        Rectangles rect1 = new Rectangles();
        rect1.ReadDimension();
        rect1.displayAreaOfRectangle();
        System.out.println("For triangle");
        Trianglle triangle1 = new Trianglle();
        triangle1.ReadDimension();
        triangle1.displayAreaOfTriangle();
    }
}

class Pollygon {
    int dimension1;
    int dimension2;

    void ReadDimension() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimension 1 and dimension 2 :");
        dimension1 = sc.nextInt();
        dimension2 = sc.nextInt();
    }
}
class Rectangles extends Pollygon {
    int calculateAreaOfRectangle(int dimension1, int dimension2) {
        int area = dimension1 * dimension2;
        return area;
    }
    void displayAreaOfRectangle() {
        System.out.println("The area of the rectangle is " + calculateAreaOfRectangle(dimension1, dimension2));
    }
}
class Trianglle extends Pollygon {
    float calculateAreaOftriangle(int dimension1, int dimension2) {
        float area = ((float) 1 / 2) * (dimension1 * dimension2);
        return area;
    }
    void displayAreaOfTriangle() {
        System.out.println("The area of the triangle is " + calculateAreaOftriangle(dimension1, dimension2));
    }
}