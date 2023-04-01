public class PrimeOneToHundred {
    public static void main(String[] args) {
        int i,j,count;
        for(i=1;i<=100;i++){
            count=0;
            for(j=i;j>=1;j--){
                if(i%j==0){
                    count=count+1;
                }
            }
            if(count<=2){
                System.out.print(i + " ");
            }
        }
    }
    
}
