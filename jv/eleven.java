package jv;
import java.util.Scanner;


public class eleven 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n, sum = 0;
            while (true)
            {
                n = sc.nextInt();
                if (n == 0)
                    break;
                else
                    sum += n;
            }
            System.out.println(sum);
        }
    }
}
