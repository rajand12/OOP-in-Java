//Write a program to demonstrate multiple catch block.
public class MultipleCatch {
    public static void main(String[] args) {
        try {
            String name = null;
            name.equals("Rajan");
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}