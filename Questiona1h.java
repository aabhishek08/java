//VIII. Sum of product of consecutive even digits of any digit number
import java.util.*;
class Question1h{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int n=sc.nextInt();
        int s=0,r,n1;
        while(n>0) {
            r = n % 10;
            n = n / 10;
            n1 = n % 10;
            if (r % 2 == 0 && n1%2==0) {
                s=s+r*n1;
            }

        }
            System.out.println("even sum:"+s);
    }

}