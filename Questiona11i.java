//j) find the sum of product of corresponding digits of 2nd largest even number and
        //3rd smallest odd number?
class Question11i{
    public static void main(String arg[]){
        int s=23,s1=23,s3=0,r1,r,le,so ;
        for(int i=23;i<=249;i++){
            if(i%2==0){
                if(s<=i){
                    s=i;
                }}
            else{
                if(s1>=i){
                    s1=i;
                }
            }
        }
        le=s-2;
        so=s1+2*2;
        System.out.println("2nd largest:"+le);
        System.out.println("3rd smalllest:"+so);
        while(le!=0 && so!=0) {
            r = le % 10;
            r1 = so % 10;
            s3 = s3 + r * r1;
            le = le / 10;
            so = so / 10;
        }
        System.out.print("sum of product of correspondig digit:"+s3);
        }
    }