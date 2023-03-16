//6. Write a java program to check weather the given number is palindrome and
//prime or not?
import java .util.*;
class Questiona6{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num:");
        int n = sc.nextInt();
        int r, n1=0, c = 0,t;
        t=n;
        while (n!= 0) {
            r = n % 10;
            n1 = n1 * 10 + r;
            n=n/10;
        }
        if (t==n1) {
            System.out.println(t+" is palindrium");
        } else {
            System.out.println(t+" is not palindrium");
        }
         for (int i = 1;i<=t;i++) {
               if (t/i == 0) c++;
        }
        if (c == 2) {
           System.out.println(t+" is prime");
        } else {
            System.out.println(t+" is not prime");
        }
    }
}
