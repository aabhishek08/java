//III. 1+x2/2! + x4/4!+x6/6!+------+xn/n!
import java.util.*;
class Questiona4c{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x:");
        int x=sc.nextInt();
        System.out.println("Enter the n ");
        int n=sc.nextInt();
        double r=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                int fj=1;
              for(int k=1;k<=i;k++){
                  fj=fj*k;
              }
               r=r+Math.pow(x,i)/fj;
            }
        }
System.out.print("R="+r);
    }
}