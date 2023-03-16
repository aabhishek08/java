/*2. Write a java program to find sum of product of corresponding digits of two
any digit number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1
 */
import java.util.Scanner;
public class Questiona2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int n = sc.nextInt();
        System.out.println("Enter the num:");
        int m = sc.nextInt();
        int r,l,s=0;
        while(n!=0 && m!=0){
            r=n%10;
            n=n/10;
            l=m%10;
            m=m/10;
            s=s+r*l;

        }
    System.out.println("sum"+s);
    }
}
