package jv;
import java.util.Scanner;

public class thriteen
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt(), pr = sc.nextInt(), count = 1;
            while (pr < n)
            {
                pr *= sc.nextInt();
                count++;
            }
            System.out.printf("%d | %d", count, pr);
        }
    }
}