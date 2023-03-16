//II. Sum of all even digits of any number
import java.util.*;
public class Questiona1b {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int s=0,r;
        while(n>0)
        {
      r=n%10;
      n=n/10;
      if(r%2==0){
          s=s+r;
      }
        }

System.out.println("sum of all even digit:"+s);
    }


}
