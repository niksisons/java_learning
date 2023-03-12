package jv;
import java.util.Scanner;

public class six
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if ((b * b - 4 * a * c) > 0)
                System.out.println(2);
            else if ((b * b - 4 * a * c) == 0)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}