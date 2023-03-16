//II. x-x3/3! + x5/5!-x7/7!+------+xn/n!
import java.util.*;
class Question4b{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x:");
        int x=sc.nextInt();
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        double r=0;
        int p,fj=1,c=1;;
        for(int i=1;i<=n;i++){
        if(i%2!=0){
            p=i;
            for(int k=1;k<=p;k++){
                fj=fj*k;
            }
           // System.out.println(r+":"+c+":"+x+":"+p+":"+fj);
            r=r+Math.pow(-1,(c+1))*Math.pow(x,p)/fj;
            c++;
            fj=1;
        } p=0;
        }
        System.out.print("R="+r);
    }}