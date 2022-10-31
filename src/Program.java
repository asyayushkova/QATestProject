import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int n = scanner.nextInt();
        double sum = 0;


        for (int i=0; i < n; i++)
        {
            System.out.println("Введите число " +(i +1));
            sum+= scanner.nextInt();
        }

        double res = sum/n;
        System.out.println(res);
    }
}

