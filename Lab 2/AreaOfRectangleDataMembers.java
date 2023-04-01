/* Modify above program to read length and breadth of a rectangle in main() function 
   and supply them in parameterized constructor to initialize its data members.*/



import java.util.Scanner;
class NewRectangle{
    int length;
    int breadth;
    int area;

    NewRectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        this.area = length*breadth;
        System.out.println("The area of the rectangle is "+area);
    }
}
    public class AreaOfRectangleDataMembers {
        public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter length and breadth of the rectangle");
        int length = input.nextInt();
        int breadth = input.nextInt();
        NewRectangle R1 = new NewRectangle(length,breadth);
        input.close();
    }
}