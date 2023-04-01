//WAP to find factorial of a number.

import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,num;
        long fac=1;
        System.out.println("Enter a number: ");
        num = input.nextInt();
        if(num<0){
            System.out.println("Factorial of negative number doesn't exist");
        }
        else{
            for(i=1;i<=num;i++){
                fac=fac*i;
            }
            System.out.println("The factorial of " +num +" is " +fac);
        }
    }
}