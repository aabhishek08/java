//IV. Sum of all prime digits of any number
import java.util.*;
public class Questiona1d {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int c=0,s=0,r;
        while(n>0){
         r=n%10;
        for(int i=1;i<=r;i++)
        {
            if(r%i==0)  c++;
        }
        if(c==2)
        {
            s=s+r;
        }
        c=0;
        n=n/10;
        }
    System.out.println("sum of all prime no:"+s);
    }
}