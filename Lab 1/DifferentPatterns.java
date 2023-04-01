/*24. WAP to print following pattern.
a. *    b. *****    c. 1     d. 1
   **       ****       12       22
   ***       ***       123      333
   ****       **       1234     4444
   *****       *       12345    55555
*/

public class DifferentPatterns {
    public static void main(String[] args) {
        int i,j,k;
        System.out.println("Pattern a:");
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++)
            System.out.print("*");
            System.out.print("\n");
        }
        System.out.println("Pattern b:");
        for (i = 1; i <= 5; i++) {
            for(k=2;k<=i;k++)
            System.out.print(" ");
            for (j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("Pattern c:");
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++)
            System.out.print(j);
            System.out.print("\n");
        }
        System.out.println("Pattern d:");
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++)
            System.out.print(i);
            System.out.print("\n");
        }
        
    }

    
}
