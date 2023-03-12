package jv;
import java.util.Scanner;

public class fiviteen
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt(), c = n - 1;
            for (int i = 1; i <= n * 2 - 1; i+=2)
            {
                System.out.println(" ".repeat(c) + "*".repeat(i));
                c--;
            }
        }
    }    
}
