package jv;
import java.util.Scanner;

public class two 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int house = sc.nextInt(), min = sc.nextInt(), second = sc.nextInt(), convert_in_sec;
            convert_in_sec = (house * 3600) + (min *60);
            if (convert_in_sec <= second)
                System.out.println("Успел");
            else
                System.out.println("Опаздал");
        }
    }
}