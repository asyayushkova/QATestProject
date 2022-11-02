import java.util.Scanner;

public class Even_odd
 {
     public static void main (String [] args)
    {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Введите число");
     int n = scanner.nextInt();

     if (n %2 ==0)
         System.out.println("Число четное");
     else
         System.out.println("Число нечетное");
    }
}
