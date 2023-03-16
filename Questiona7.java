//7. Write a java program to find factorial of a number using while loop, do while loop
//        and for loop all in one program?[hint use switch block]?
import java.util.*;
class Questiona7{
    public static void  main(String arg[]){
       Scanner sc=new Scanner(System.in);
        System.out.print("enter '1:while loop,2:do while loop,3:for loop' for calculating factorial=" );
        int n1=sc.nextInt();
       System.out.print("enter the num:");
       int n=sc.nextInt();
       int m=1,r=1;
       switch(n1) {
           case 1:
               while (m <= n) {
                   r = r * m;
                   m = m + 1;
               }
               System.out.print(" factorial:"+r);
               break;
           case 2:
               do {
                   r = r*m;
                   m = m + 1;
               } while (m <= n);
               System.out.print(" factorial:"+r);
               break;
           case 3:
               for (int i = 1; i <= n; i++) {
                   r = r * i;
               }
               System.out.print(" factorial:"+r);
               break;
           default:
               System.out.println("invalid output");
       }
    }
}