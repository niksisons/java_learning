import java.util.Scanner;
import java.util.Arrays;

public class three 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt();
            int[] s = new int[n];
            for (int i = 0; i < n; i++)
            {
                s[i] = sc.nextInt();
            }
            int minim = Arrays.stream(s).max().orElseThrow();
            System.out.println(minim);
        }
    }
}