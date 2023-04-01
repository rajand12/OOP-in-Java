//Write a program to search any string indexOf() and lastIndexOf() methods.
public class IndexAndLastIndex {
    public static void main(String[] args) {
        String random = new String("Hello World");
        String random2 = new String("This is me from the future.");
        int a,b;
        a = random.indexOf("H");
        System.out.println("The index of H is "+a);
        b = random2.lastIndexOf("me");
        System.out.println("The last index of me is "+b);
    }
    
}
