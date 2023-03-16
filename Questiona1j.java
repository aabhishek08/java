//X. Sum of product of consecutive prime digits of any digit number
import java.util.Scanner;
class Questiona1j{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num:") ;
        int n=sc.nextInt();
        int r,s=0,r1,p=0,c=0;
           while(n!=0){
            r = n % 10;
            n = n / 10;
            r1 = n % 10;
            for(int i=1;i<=r;i++) {
                if (r%i==0) c++;
            }
            for(int i=1;i<=r1;i++)
               {
                   if(r1%i==0) p++;
               }
            if(c==2 && p==2){
                s=s+r*r1;
            }
           c=0;p=0;}
        System.out.println("Sum of prime digit: "+s);
    }
}