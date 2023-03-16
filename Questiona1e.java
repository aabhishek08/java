//V. Difference between average of all even digits except divisible by 4
//    and average of all odd digits except divisible by 3
import java.util.Scanner;
public class Questiona1e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   System.out.println("enter the num:");
   int n=sc.nextInt();
   int r,d,E=0,s=0,O=0,p=0;
   while(n!=0){
       r=n%10;
       n=n/10;
       if(r%2==0){
           if(r%4!=0){
               E=s+r;
           }
       }
       else if(r%2!=0){
           if(r%3!=0){
               O=p+r;
           }
       }
   }
   d=E-O;
   System.out.println("diff="+d);
    }
}

