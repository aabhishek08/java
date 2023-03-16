// d) find number of palindrome numbers?
class Questiona11d{
    public static void main (String args[]) {
        int n1,n2, r,s = 0,count=0;
        System.out.print("pallindrium bnum in between 23 to 249 are:");
        for (int i = 23; i <249; i++)
        {
            n1 =i;
            n2=i;
            while(n1!=0){
            r = n1 % 10;
            s = s * 10 + r;
            n1 =n1/ 10;
            }
            if (n2==s)
                {
                    count++;
                    System.out.print(n2+",");
                }
            s=0;
    }
        System.out.println("\ntotal number of pallidrium:"+count);
    }
}