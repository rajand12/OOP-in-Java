// Write a program to implement abstract class and final class to achieve abstraction.
public class AbstractAndFinalClass {
    public static void main(String[] args) {
        Child1 child=new Child1();
        Child2 child2= new Child2();
        AboutMe info = new AboutMe();
        child.name();
        child.address();
        child.email();
        child2.name();
        child2.address();
        child2.email();
        info.name();
        info.email();
    }
}
abstract class ParentClass {
    abstract void name();
    abstract void address();
    abstract void email();
}
class Child1 extends ParentClass {
    void name() {
        System.out.println("Hello I'm Child 1.");
    }
    void address() {
        System.out.println("I live in Balaju.");
    }
    void email(){
        System.out.println("My email is child1@gmail.com\n\n");

    }
}
class Child2 extends ParentClass {
    void name() {
        System.out.println("Hello I'm Child2");
    }
    void address() {
        System.out.println("I live in Putalisadak.");
    }
    void email(){
        System.out.println("My email is child2@gmail.com");

    }
}
final class AboutMe {
    void name() {
        System.out.println("\n\nRajan Dotel");
    }

    void email() {
        System.out.println("rajan.dotel11@gmail.com");
    }
}
//No child class can be inherited from final class 