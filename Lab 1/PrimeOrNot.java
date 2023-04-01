//WAP to check whether a number is prime or not.

import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num,i,count=0;
        System.out.println("Enter a number");
        num = input.nextInt();
        for(i=2;i<num;i++){
            if(num%i==0){
                count += 1;
            }
        }
        if(count==0){
            System.out.println(num + " is a prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
        }
    }    
}
