/*12. Write a java program to find following of 10 numbers using command line
arguments? Do not use array?
b) find difference between average of all odd numbers and even numbers?
*/
class Questiona12b{
    public static void main (String args[])
    {
        System.out.println("Entered 10 numbers:");
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
        int Ec=0,Oc=0,sumE=0,sumO=0;
        float avgE,avgO;
        for(int j=0;j<args.length;j++)
        {
            if(Integer.parseInt(args[j])%2==0)
            {
                sumE=sumE+Integer.parseInt(args[j]);
                Ec++;
            }
            else
            {
                sumO=sumO+Integer.parseInt(args[j]);
                Oc++;
            }
        }
        System.out.println("Sum of even Numbers: "+sumE);
        System.out.println("Total even numbers: "+Ec);
        avgE=(float)sumE/Ec;
        System.out.println("Average of Even numbers: "+avgE);
        System.out.println("Sum of odd Numbers: "+sumO);
        System.out.println("Total odd numbers: "+Oc);
        avgO=(float)sumO/Oc;
        System.out.println("Average of odd numbers: "+avgO);
        float Difference=avgO-avgE;
        System.out.println("\nDifference between average of all odd numbers and even numbers: "+Difference);
    }
}