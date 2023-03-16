//VII. Sum of product of consecutive digits of any digit number
import java.util.*;
class Questiona1g{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        int r,p,s=0,n1;int c=0;
        while(n>0) {
            r = n % 10;
            n = n / 10;
            n1=n%10;
            s=s+r*n1;
            c=c+1;
        }
        System.out.println("num:"+s);
        System.out.println(c);
    }
}