//WAP to find sum of odd numbers from 1 to 100.

public class OddOneToHundred{
    public static void main(String[] args) {
        int i,sum=0;
        for(i=0;i<=100;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("The sum of odd numbers from 1 to 100 is " +sum);
    }
}