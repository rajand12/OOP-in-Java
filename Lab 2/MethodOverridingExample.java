/*Write a program with two classes. Include a function with same name and same 
signature in each class to illustrate use of function overriding.*/

public class MethodOverridingExample{
    public static void main(String[] args) {
        Parent obj=new Parent();
        obj.method1();
        Child obj2=new Child();
        obj2.method1();
    }
}
class Parent{
void method1(){
    System.out.println("This is original method.");
}
}
class Child extends Parent{
    void method1(){
    System.out.println("This is overridden method.");
    }
}