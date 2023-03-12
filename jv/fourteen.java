package jv;
import java.util.Scanner;

public class fourteen
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++)
            {
                System.out.println("*".repeat(i));
            }
        }
    }
}