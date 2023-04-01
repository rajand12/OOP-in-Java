/*Write a program to demonstrate throw and throws keyword.*/
class DivideByZero{
    int b;
    void ZeroDivide(int a)throws ArithmeticException{
        b=a/0;  
    }
}

public class ThrowAndThrows{    
    public static void main(String args[])
    {
        System.out.println("Hello");
        int a=10;
        DivideByZero obj = new DivideByZero();
        try {
            obj.ZeroDivide(a);
        } catch (Exception e) {
            System.out.println("Caught in method."); 
        }
        System.out.println("For Throw");
        a=0;
        if(a==0){
            throw new ArithmeticException("/ by zero");
        }
    }
}

