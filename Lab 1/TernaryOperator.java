//WAP to show the use of ternary operator.

import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  
        int num;
        String s;
        System.out.println("Enter a number");
        num = input.nextInt();
        s = num%2==0?"even":"odd"; 
        System.out.println(num + " is an " +s + " number." );
    }
    
}
