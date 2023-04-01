//Write a program to demonstrate character extraction using charAt() and getChars() methods.

public class CharacterExtraction {
    
    public static void main(String[] args) {
        String sentence = new String("My name is Rajan Dotel.");
        char name[]=new char[20];
        char location5;
        sentence.getChars(11,22,name,0);
        location5 = sentence.charAt(5);
        System.out.println(name);
        System.out.println(location5);
    }
    
}
