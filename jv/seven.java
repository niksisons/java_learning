package jv;
import java.util.Scanner;

public class seven
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (a + b < c || a + c < b || b + c < a)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}