//Write a program to demonstrate string comparison using equals() and compareTo() methods.



public class StringComparision {
    public static void main(String[] args) {
        String str1 = new String("Hello World");
        String str2 = new String("Hello World");
        String str3 = new String("Rajan");
        String str4 = new String("Rohil");

        if(str1.equals(str2)){
            System.out.println("The given two strings are equal");
        }
        else{
            System.out.println("The given strings are not equal.");
        }
        if(str3.compareTo(str4)==0){
            System.out.println("The given strings are equal");
        }
        else if(str3.compareTo(str4)<0){
            System.out.println("str3 is less than str4.");
        }
        else{
            System.out.println("str3 is greater than str4.");
        }
    }
    
}
