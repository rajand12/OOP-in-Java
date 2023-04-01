//23.WAP to print following Fibonacci series. 1, 1, 2, 3, 5, 8, …….. upto 15 terms.

public class FibonacciSeries{
    public static void main(String[] args) {
        int a=0,b=1,c,i;
        for(i=1;i<=15;i++){
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
        }
    }
