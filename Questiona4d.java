//IV. x-x3/3! + x5/5!-x7/7!+x11/11!------+xn/n!
import java.util.*;
class Questiona4d{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x:");
        int x=sc.nextInt();
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int o=1;
        double r=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                int fj=1;
                for(int k=1;k<=i;k++){
                    fj=fj*k;
                }
                r=r+Math.pow(-1,(o+1))*Math.pow(x,i)/fj;
                o++;
            }
        }System.out.println("R="+r);

    }
}
