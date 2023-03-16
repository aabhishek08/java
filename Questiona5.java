//5. Write a java program compute following series and take a numbers num as
//input x-x3/3! + x5/5!-x7/7!+------+xn/n!
// where x=sum of all even digits except 2 and 8
// and n= sum of all odd digits except 1 and 3
import java.util.*;
class Questiona5{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
      int num[]=new int[10];
       int se=0,so=0;
        System.out.println("enter the 10 nos:");
        for(int i=0;i<10;i++){
            num[i]=sc.nextInt();
        }
        System.out.print("context of array:");
        for(int i=0;i<10;i++){
            System.out.print("num["+i+"]="+num[i]+",");
        }
        for(int i=0;i<10;i++){
            if(num[i]%2==0){
                if(num[i]!=2 && num[i]!=8){
                    se=se+num[i];
                }
            }else {
                if (num[i]!=1 && num[i]!=3){
                    so=so+num[i];
                }
            }
        }
        System.out.print("\nsum of even number except 2 and 8:"+se);
        System.out.println("\nsum of odd number except 1 nad 3:"+so);
        double r=0;
        int x=se;
        int n=so;
        for(int i=1;i<=n;i++){
          int j=2*i-1;
          int fj=1;
          for(int k=1;k<=j;k++){
              fj=fj*k;
          }
              r=r+Math.pow(-1,(i+1))*(Math.pow(x,j)/fj);
          }
          System.out.println("R="+r);}


    }
