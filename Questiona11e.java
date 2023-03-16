//e) find difference between average of palindrome and prime numbers?
class Questiona11e{
    public static void main(String args[]){
        int n1,n2,s=0,s2=0,r,sp=0,c=0,p=0,c1=0;
        float avp,apn;
           for (int i=23;i<=249;i++) {
               n1 = i;
               n2 = i;
               while (n1 != 0) {
                   r = n1 % 10;
                   s = s * 10 + r;
                   n1 = n1 / 10;
               }
               if (n2 == s) {
                   c++;
                   sp = sp + n2;
                   System.out.print(n2 + ",");
               }
               s = 0;
           }
     avp=sp/c;
         System.out.println("\naverage:"+avp);

       for (int i=23;i<=249;i++){
                for(int j=1;j<=i;j++){
                    if(i%j==0) p++;}{
                if(p==2){
                   c1++;
                   s2=s2+i;
                    System.out.print(i+",");
                }
                }
        p=0;
        }
        apn=s2/c1;
        System.out.println("\naverage of prime number:"+apn);
       float d=avp-apn;
        System.out.println("Difference:"+d);
    }
}