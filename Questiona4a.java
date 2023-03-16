//4. Write a java program to compute following series and take input x and n
//I. 1-x2/2! + x3/3!-x4/4!+------+xn/n!
import java.util.Scanner;
class Questiona4a{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the X:");
       int x=sc.nextInt();
       System.out.println("Enter the n:");
       int n=sc.nextInt();
       double r=1;
        for(int i=1;i<=n;i++){
            int j=i+1;
            int fj=1;
            for(int k=1;k<=j;k++){
                fj=fj*k;
            }
            r=r+Math.pow(-1,i)*Math.pow(x,j)/fj;
       ///     System.out.println(j+","+fj+","+r+",");
            fj=0;
            j=0;
        }
        System.out.println("\nR="+r);
    }
}
