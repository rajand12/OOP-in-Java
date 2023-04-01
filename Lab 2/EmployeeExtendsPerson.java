/* 11.Create a class named Person which has name & age as data members and
 appropriate function members to read and display its data. Create another class
 Employee derived from class Person to use features of base class (single).*/

import java.util.Scanner;
class Person {
    private String name;
    private int age,id;
    Scanner sc = new Scanner(System.in);
    void read(){
        System.out.println("Enter name :");
        name = sc.nextLine();
        System.out.println("Enter age :");
        age = sc.nextInt();
        System.out.println("Enter id :");
        id =sc.nextInt();
    }
    void display() {
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Id :" + id);

    }
}
class Employee extends Person {
}
public class EmployeeExtendsPerson{
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.read();
        employee1.display();
    }
}