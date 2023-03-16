//IX. Sum of product of consecutive odd digits of any digit number
import java.util.Scanner;
class Questiona1i{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter the num:") ;
     int n=sc.nextInt();
     int r,s=0,n1;
     while(n>0){
         r = n % 10;
         n = n / 10;
         n1 = n % 10;
         if(r%2!=0 && n1%2!=0){
             s=s+r*n1;
         }
     }
    System.out.println("Sum of odd digit: "+s);
    }
}