//Write a program to demonstrate exception handling using try, catch and finally block.



public class ExceptionHandling {
    public static void main(String[] args) {
        int random=45,result;
        try {
            result=random/0;
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
         finally{
                 System.out.println("This is finally block");
         }
             System.out.println("This is the block of main function.");
    }   
}
