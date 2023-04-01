//Write a program to demonstrate modification of string using substring(), replace(), 
//concat() and trim() methods.
public class StringModification {
    public static void main(String[] args) {
        String str = new String("Rajan");
        String str1 = new String("Dotel");
        String str2 = new String("    Hello! My name is Rajan Dotel    ");
        String str3 = new String("Random Text");
        String newString = new String();
        System.out.println(str2.substring(22,33));
        System.out.println(str3.replace("Random","Rajan"));
        newString = str.concat(str1);
        System.out.println(newString);
        System.out.println(str2.trim());
    }
    
}
