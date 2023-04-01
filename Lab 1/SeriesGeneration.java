/*WAP to print following series.
a. 5, 10, 15, 20, ...... 50
b. 1, 4, 9, 16, ..... upto 20 terms.
c. 100, 98, 96, 94, ............. Upto 10 terms. */

public class SeriesGeneration{
    public static void main(String[] args) {
        int i,j=5,k,l=100;
        System.out.println("First Series:");
        for(i=0;i<10;i++){
            System.out.print(j + " " );
            j=j+5;
        }
        System.out.println("\nSecond Series:");
        for(i=1;i<=20;i++){
            k=i*i;
            System.out.print(k + " ");
        }
        System.out.println("\nThird Series:");
        for(i=0;i<10;i++){
            System.out.print(l + " ");
            l=l-2;
        }
    }
}