//1. Write a java program to find following using looping and decision making
   //     without function
  //      I. Sum of all digits of any numbers
import java.util.*;
public class Questiona1a {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int s=0;
        while(n!=0){
        s=s+n%10;
        n=n/10;
        }
        System.out.println("sum of digit="+s);
}}
