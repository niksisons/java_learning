
import java.util.Scanner;
import java.util.Random;

public class moreOrless
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        while (true)
        {
            int randomInt = rand.nextInt(100) + 1, n = 0;
            System.out.printf("A number from 1 to 100 was guessed. %d\n", randomInt);
            while (n != randomInt)
            {
                System.out.print("enter your answer:");
                n = in.nextInt();
            }
            System.out.printf("Right. The correct answer was %d ", randomInt);
            System.out.println("Want to continue playing '0' '1': ");
            boolean play = in.hasNext();
            if (!play)
                break;
        } 
        System.out.println("Thank for play"); 
    }
}