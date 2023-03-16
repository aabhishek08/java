/*12. Write a java program to find following of 10 numbers using command line
        arguments? Do not use array?
        a) find difference between greatest and smallest number? */
class Questiona12a{
    public static void main(String args[])
    {
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
        int greatest=Integer.parseInt(args[0]);
        for(int j=0;j<10;j++)
        {
            if(Integer.parseInt(args[j])>greatest)
            {
                greatest=Integer.parseInt(args[j]);
            }
        }
        System.out.print("\nGreatest number is: "+greatest);
        int smallest=Integer.parseInt(args[0]);
        for(int j=0;j<args.length;j++)
        {
            if(Integer.parseInt(args[j])<smallest)
            {
                smallest=Integer.parseInt(args[j]);
            }
        }
        System.out.print("\nsmallest number is: "+smallest);
    }
}