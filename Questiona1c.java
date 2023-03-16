//III. Sum of all odd digits of any number
import java.util.*;
public class Questiona1c {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int n=sc.nextInt();
        int s=0,r;
        while(n>0){
            r=n%10;
            n=n/10;
            if(r%2!=0){
                s=s+r;
            }
        }
        System.out.println("sum of odd digit:"+s);
    }
}
