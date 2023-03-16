//b) find number of odd numbers that ends with 5 and 7?
class Questiona11b{
    public static void main(String arg[]){
        int r=0,count=0;
        for(int i=23;i<=249;i++){
            if(i%2!=0){
                r=i%10;
                if(r==5 || r==7)
                {
                    count++;
                    System.out.print(i+",");
                }
            }
        }
        System.out.println();
        System.out.println(count);

    }
}
