import java.util.Scanner;

public class Array
{
   public static void main (String [] args)
   {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Введите количество чисел");
     int n = scanner.nextInt();

     double res = 0;

     int[] arr = new int [n];

     for (int i=0; i< arr.length; i++)
     {
         System.out.println("Введите число " +(i +1));
         arr[i] = scanner.nextInt();
     }

     for (int i=0; i< arr.length; i++)
     {
       res +=arr[i];
     }

     res= res/arr.length;

     System.out.println("Среднее арифметическое массива: " + res);
  }
 }
