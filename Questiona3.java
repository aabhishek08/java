//3. Write a java program to find sum of product of corresponding even digits of
 //       first any digit number and corresponding odd digit of any digit number Such
  //      as n=1234 m=4567 output=4*7+2*5
import java.util.Scanner;
public class Questiona3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int n = sc.nextInt();
        System.out.println("Enter the num:");
        int m = sc.nextInt();
        int r, l, s = 0;
        while (n != 0 && m != 0) {
            r = n % 10;
            n = n / 10;
            l = m % 10;
            m = m / 10;
            if (r % 2 == 0 && l % 2 != 0) {
                s = s + r * l;
            }
        }
        System.out.println("sum" + s);
    }}