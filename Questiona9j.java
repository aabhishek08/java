///j) find the sum of product of corresponding digits of 2nd largest even number and 3rd smallest odd number?
import java.util.*;
class Questiona9j{
    public static void main(String args[]){
        int le=23,so=23;
        for(int i=23;i<=249;i++){
            if(i%2==0){
                if(le<=i){
                    le=i;
                }
            }
            else{
                if(so>=i){
                    so=i;
                }
            }
        }
        le=le-2;
        so=so+2*2;
        int ed,od,sd=0;
        System.out.println("2nd largest even number:"+le);
        System.out.println("3rd smallest odd number:"+so);
        while(le!=0 && so!=0){
            ed=le%10;
            le=le/10;
            od=so%10;
            so=so/10;
            sd=sd+ed*od;

        }
        System.out.println("sum of digit:"+sd);
    }

}