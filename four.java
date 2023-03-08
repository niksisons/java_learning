import java.util.Scanner;

public class four
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int year = sc.nextInt();
            if (year % 4 == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}