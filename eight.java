import java.util.Scanner;

public class eight
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            if (Math.abs(a - c) == Math.abs(b - d))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}