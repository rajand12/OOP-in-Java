/* 15) Create a class Polygon with data members to represent two dimensions and
      parameterized constructor to initialize data members. Derive two classes Rectangle
      and Triangle from Polygon class with appropriate member function to calculate area
      of each rectangle and triangle.*/
import java.util.Scanner;

public class PolygonRectangleTriangle{
    public static void main(String[] args) {
        System.out.println("For Rectangle");
        Rectanglee obj1= new Rectanglee();
        obj1.read();
        obj1.displayAreaOfRectangle();
        Triangle obj2 = new Triangle();
        System.out.println("For Triangle");
        obj2.read();
        obj2.displayAreaOfTriangle();
    }
}
class Polygon{
    int dimension1;
    int dimension2;
    Polygon(){

    }
    Polygon(int dimension1,int dimension2){
        this.dimension1=dimension1;
        this.dimension2=dimension2;
    }
    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions : ");
        dimension1=sc.nextInt();
        dimension2=sc.nextInt();
    }
}
class Rectanglee extends Polygon {
    
    int calculateAreaOfRectangle(int dimension1, int dimension2) {
        int area = dimension1 * dimension2;
        return area;
    }

    void displayAreaOfRectangle() {
        System.out.println("The area of the rectangle is " + calculateAreaOfRectangle(dimension1, dimension2));
    }
}

class Triangle extends Polygon {

    float calculateAreaOftriangle(int dimension1, int dimension2) {
        float area = ((float) 1 / 2) * (dimension1 * dimension2);
        return area;
    }

    void displayAreaOfTriangle() {
        System.out.println("The area of the triangle is " + calculateAreaOftriangle(dimension1, dimension2));
    }
}