//Write a program to input any string and convert it to uppercase and lowercase.
public class UppercaseAndLowercase {
    public static void main(String[] args) {
        String original = "RaJan";
        String upper,lower;
        lower = original.toLowerCase();
        upper = original.toUpperCase();
        System.out.println("Original String: "+original);
        System.out.println("UpperCase: "+upper);
        System.out.println("LowerCase: "+lower);
        
    }
    
}
