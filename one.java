import java.util.Scanner;

public class one 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int count_pie = sc.nextInt(), count_after;
            count_after = count_pie / 2;
            System.out.println(count_after);
        }
    }

}
