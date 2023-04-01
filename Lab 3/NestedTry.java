//Write a program to demonstrate nested try block.
public class NestedTry {
    public static void main(String[] args) {
        try {
            String str = null;
            str.equals("Rajan");
            System.out.println("This is the first try block.");
            try {
                int arr[] = { 4 };
                int c = arr[3];
                System.out.println("This is the second try block.");
                try {
                    int result = 20 / 0;
                    System.out.println("This is the third try block.");

                } catch (ArithmeticException e) {
                    System.out.println("Exception occured third try block");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception occured in second try block");

            }
        } catch (NullPointerException e) {
            System.out.println("Exception occured in first try block");
        }
    }
}