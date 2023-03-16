//11. Write a program to perform following using the numbers in between 23 to 249?
// a) find number of even numbers that ends with 0 and 4?
import java.util.*;
class Questiona11a{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
      int n=249,r=0,count=0;
      for(int i=23;i<=n;i++){
          if(i%2==0){
              r=i%10;
              if(r==0 || r==4){
                  System.out.print(""+i+",");
              }
          }
      }
    }
}
