/*Write a program to handle following exceptions:
   a) Arithmetic b) NullPointer c) ArrayIndexOutOfBound
   d) StringIndexOutofBound e) NumberFormatException*/


class Arithmetic{
    int a;
    void display(){
        try {
            this.a=45/0;
        } catch (Exception e) {
            System.out.println("Arithmetic Exception Caught");
        }

    }
} 
class ArrayIndexOutOfBound{
    int num[]={1,2,3,4},num1;
    void display(){
        try {
            this.num1=num[4];
        } catch (Exception e) {
            System.out.println("Array Index Out of Bound Exception Caught");
        }
        
    }
} 
class NullPointer{
    String str = null;
    void display(){
        try {
            System.out.println(str.equals("Hello"));
        } catch (Exception e) {
            System.out.println("Null Pointer Exception Caught");
        }
    }
}
class NumberFormat{
    String str1 = "Hello";
    int num1;
    void dispaly(){
        try {
            this.num1 = Integer.parseInt(str1);
        } catch (Exception e) {
            System.out.println("Number Formating Exception Caught");
        }
        
    }
}
class StringIndexOutofBound{
    String str = "Hello World";
    void display(){
        try {
            System.out.println("Letter at index 17 in Hello World is" + str.substring(17));
        } catch (Exception e) {
            System.out.println("String Index Out of Bound Exception Caught");
        }
    }
}
public class DifferentExceptions{
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        obj.display();
        ArrayIndexOutOfBound obj1 = new ArrayIndexOutOfBound();
        obj1.display();
        NullPointer obj2 = new NullPointer();
        obj2.display();
        NumberFormat obj3 = new NumberFormat();
        obj3.dispaly();
        StringIndexOutofBound obj4 = new StringIndexOutofBound();
        obj4.display();
    }
}