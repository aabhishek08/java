//VI. Find kth digit from front side or back side of any digits number
//and find its positional value
import java.util.*;
class Questiona1f{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("enter k digit");
        int k = sc.nextInt();
        System.out.println("enter front side for:1,backside for:2");
        int s = sc.nextInt();
        int re = 0, r, r1, c = 0;
        double pv=0;
        switch (s) {
            case 1: {
                while (n != 0) {
                    r = n % 10;
                    re = re * 10 + r;
                    n = n / 10;
                }
                while (re != 0) {
                    r1 = re % 10;
                    c+=1;
                    if (r1 == k) {
                        System.out.println("kth position front side:" + c);
                        pv=Math.pow(10,c)*k;
                        System.out.println("position value:"+pv);
                    }                        re = re / 10;

                }
            }
            case 2: {
                while (n != 0) {
                    r = n % 10;
                    c=c+1;
                    if (r == k) {
                        System.out.println("kth position back side:"+c);
                        pv=Math.pow(10,c);
                        System.out.println("position value:"+pv);
                    }n=n/10;
                }
            }
            break;
            default:
                System.out.println("invalid output");
        }
    }
}
