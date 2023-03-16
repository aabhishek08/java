//h) Check whether the difference between largest even number and smallest odd
  //      number is palindrome or not?
class Questiona11h{
    public static void main(String arg[]){
        int s=23,s1=23,g=0,sm=0;
        for(int i=23;i<=249;i++){
            if(i%2==0){
                if(s<=i){
                    g=i;
                }
            }
            else{
                if(s1>=i){
                    sm=i;
                }
            }
        }
System.out.println("Greatest:"+g);
        System.out.println("Smallest:"+sm);
        int r,p=0,l;
        int d=g-sm;
        l=d;
        System.out.println("Difference between largest even num and  smallest odd num:"+d);
        while(d!=0){
            r=d%10;
            p=p*10+r;
            d=d/10;
        }
        if(l==p){
            System.out.println("pallidrium:"+l);
        }else{
            System.out.println(l+" not a pallidrim");
        }
    }
}
