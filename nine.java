import java.util.Scanner;

public class nine 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int k = sc.nextInt(), m = sc.nextInt() * 2, n = sc.nextInt();
            System.out.println((n / k * m)  + (n % k * m));
        }
    }
}