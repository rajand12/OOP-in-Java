public class AutoIncrementDecrement {
    public static void main(String[] args){
        int i=1,j=7,k=6,l=9,m,n,o,p;
        System.out.println("Value before increment: "+i);
        m=i++;
        System.out.println("Value after post increment: "+m);
        System.out.println("Value before increment: "+j);
        n=++j;
        System.out.println("Value after pre increment: "+n);
        System.out.println("Value before decrement: "+k);
        o=k--;
        System.out.println("Value after post decrement: "+o);
        System.out.println("Value before decrement: "+l);
        p=--l;
        System.out.println("Value after pre decrement: "+p);
    }
    
}
