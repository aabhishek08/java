//10. Write a program to generate Fibonacci series up to n terms? Value of n will be
//accepted from user?
import java.util.*;
class Questiona10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to print fibonacci series upto n terms:");
        int n=sc.nextInt();
        int m=0,l=1,p=0;
        System.out.print(m+" "+l);
        for(int i=2;i<=n;i++)
        {
            p=m+l;
            System.out.print(" "+p);
            m=l;
            l=p;
        }
    }
}