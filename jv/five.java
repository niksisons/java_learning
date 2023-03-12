package jv;
import java.util.Scanner;

public class five 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int a = sc.nextInt(), b = sc.nextInt();
            if (a != 0)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}