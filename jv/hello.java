package jv;

import java.util.Scanner;

public class hello 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long a = 0, b = 1, c;
            int n = sc.nextInt();
            for (int i = 0; i != n; i++){
                c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }
        }
    }
    
}