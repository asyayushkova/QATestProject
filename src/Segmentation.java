import java.util.Scanner;

public class Main3 {
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        int result = 0;

        while (n % 2 == 0)
        {
            n  = n / 2;
            result++;
        }

        System.out.println(result);
    }
}


