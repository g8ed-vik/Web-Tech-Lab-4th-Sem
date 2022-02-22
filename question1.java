import java.util.*;
class question1
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,num,d=0,rev=0;
        System.out.println("Enter the num");
        n=sc.nextInt();
        num=n;
        while(num > 0)
        {
            d=num%10;
            rev=(rev*10)+d;
            num=num/10;
        }
        if(n == rev)
            System.out.println("It is a Palindrome ");
        else
            System.out.println("It is not a Palindrome ");
        num=n;
        rev=0;
        while(num > 0)
        {
            d=num%10;
            rev=rev+(d*d*d);
            num=num/10;    
        }
        if(n == rev)
            System.out.println("It is an Armstrong Number ");
        else
            System.out.println("It is not an Armstrong Number");
    }
}