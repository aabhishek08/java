//9. Write a program to find factorial of difference between greatest and smallest
//number among 3 numbers?
import java.util.*;
class Questiona9{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int g, s,d=0,r=1;
        if (a >= b && a >=c) {
            g = a;
        } else if (b >= a && b >= c) {
            g = b;
        } else g = c;
    System.out.println("greatest:"+g);
        if (a <= b && a <= c) {
            s= a;
        } else if (b <= a && b <= c) {
            s = b;
        } else s = c;
        System.out.println("smallest:"+s);
        d=g-s;
        System.out.println("difference between greatest and smallest:"+d);
        for(int i=1;i<=d;i++){
            r=r*i;
        }
      System.out.println("factorial of  the difference is:"+r);
    }
}