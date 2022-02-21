import java.util.*;
public class q4
{
    public static void main (String[] args)
    {
            Scanner sc = new Scanner(System.in);
            int num;
            System.out.println("Enter the number");
            num = sc.nextInt();
            int fact = 1;
            for (int i = 1; i <= num; i++)
                fact *= i;
            System.out.println("\nFactorial of the number is  " + fact);
    }          
}