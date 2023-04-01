// WAP to to input CP and SP and check profit or loss. Also find profit or loss amount.
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int cp,sp,profit,loss;
    System.out.println("Enter cost price and selling price: ");
    cp = input.nextInt();
    sp = input.nextInt();
    if(cp>sp)
    {
        loss = cp-sp;
        System.out.println("You have got loss of Rs." +loss);
    }
    else if(sp>cp)
    {
        profit = sp-cp;
        System.out.println("You have got profit of Rs." +profit);
    }
    else
    {
        System.out.println("You have encurred neither profit nor loss");
    }
    }
}
