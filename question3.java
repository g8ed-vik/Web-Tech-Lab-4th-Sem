class question3
{
    public static void main(String Args[])
    {
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("0");
            }
            System.out.print("*");
            for(int k=3;k>i;k--)
            {
                System.out.print("0");
            }
            System.out.print("*");
            for(int l=3;l>i;l--)
            {
                System.out.print("0");
            }
            System.out.print("*");
            for(int m=0;m<i;m++)
            {
                System.out.print("0");
            }
            System.out.println("");
        }
        for(int i=3;i>=0;i--)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(j);
            }
            for(int k=(i*2);k<6;k=k+2)
            {
                System.out.print("**");
            }
            for(int l=i+1;l>0;l--)
            {
                System.out.print(l);
            }
            System.out.println("");
        }
    }
   }