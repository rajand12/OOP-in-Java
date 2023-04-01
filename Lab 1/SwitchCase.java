//WAP to show the use of switch case statement.

import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,sum,diff,prod,choice;
        System.out.println("Enter two numbers");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Menu:");
        System.out.println("1. Sum");
        System.out.println("2. Difference");
        System.out.println("3. Product");
        System.out.println("Enter your choice:");
        choice = input.nextInt();
        switch(choice){
            case 1:
                sum = a+b;
                System.out.println("The sum is " +sum);
                break;
            case 2:
                diff = a-b;
                System.out.println("The difference is " +diff);
                break;
            case 3:
                prod = a*b;
                System.out.println("The product is " +prod);
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }
}
