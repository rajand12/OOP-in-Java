/* Define a class Rectangle with data members: length and breadth. Initialize its data
   members with some fixed values (i.e. say 100 and 200 for length and breadth
   respectively) using a constructor. Write a program to use an object of the class to
   calculate area of a rectangle. */

   class Rectangle {
         int length;
         int breadth;
    
        Rectangle(){
            length = 100;
            breadth = 200;
        }
   }
        public class AreaOfRectangleConstructor {
        public static void main(String[] args) {
            Rectangle r1 = new Rectangle();
            int area = r1.length * r1.breadth;
            System.out.println("The area is :" + area);
        }
    
    }
    

