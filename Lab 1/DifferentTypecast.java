/* WAP to typecast the following:
        a) Integer to String
        b) String to Integer
        c) Integer to Double
        d) Double to Integer
        e) String to Double
        f) Double to String*/

        import java.util.Scanner;
        public class DifferentTypecast {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int i,i1,i2;
            String s,s1,s2;
            double d,d1,d2;
            System.out.println("Enter a string:");
            s = input.nextLine();
            System.out.println("Enter a integer:");
            i = input.nextInt();
            System.out.println("Enter a double floating point number:");
            d = input.nextDouble();
            //s1=(String)i;
            //i1=(int)s;
            System.out.println("Integer to Double:");
            d1=(double)i;
            System.out.println(d1);
            System.out.println("Double to Integer:");
            i2=(int)d;
            System.out.println(i2);
            //d2=(double)s;
            //s2=(String)d;
            }
        }
