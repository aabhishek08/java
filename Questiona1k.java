//XI. Difference between Sum of product of consecutive even digits except 2 and 6
// and Sum of product  of consecutive odd digits except 3 and 7 of any digit number
import java.util.*;
class Questiona1k{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int r,r1,so=0,se=0,d;
        while(n!=0){
            r=n%10;
            n=n/10;
            r1=n%10;
           if(r%2==0 && r1%2==0){
               if(r!=2 && r1!=6){
                   se=se+r*r1;
                }
            }
           else{
               if(r%2!=0 && r1%2!=0){
               if(r!=3 && r1!=7){
                   so=so+r*r1;
               }
           }
        }}
        d=se-so;
        System.out.println("consecutive even digits except 2 and 6:"+se);
        System.out.println("consecutive even digits except 3 and 7:"+so);
         System.out.println("Difference="+d);
    }
}