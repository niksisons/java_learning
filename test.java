import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList; 



public class test
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String[] a = new String[5];
        String b = "1234";
        for (int i = 0; i < a.length; i++)
            System.out.printf("%s == %d\n", a[i], a.length);
        if (b.isEmpty())
            System.out.println("Empty");
        System.out.println(Arrays.toString(a));
    }
    public void one() 
    { 
        // Обычный массив
        int[] arr = new int[2]; 
        arr[0] = 100; 
        arr[1] = 200; 
        System.out.println(arr[0]); 

        // ArrayList
        // Создаем ArrayList с начальной емкостью 2
        ArrayList<Integer> arrayList = new ArrayList<Integer>(2); 

        // Добавляем элементы в ArrayList 
        arrayList.add(300); 
        arrayList.add(400); 

        // Доступ к элементам ArrayList 
        System.out.println(arrayList.get(0)); 
    }   
}   