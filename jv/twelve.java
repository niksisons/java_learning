package jv;
import java.util.Scanner;

public class twelve 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt(), x = sc.nextInt(), count = 0;
            while (x < n)
            {
                x += x;
                count++;
            }
            System.out.printf("%d за %d ходов", x, count);
        }
    }
}