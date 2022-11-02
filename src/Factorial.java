import java.util.Scanner;//задача найти факториал и вызвать из функции мейн

public class Main {
    public static int factorial(int n) {
        int fac = 1;
       for (int i = 1; i<=n; i++) {
           fac = fac *i;
       }
        return fac;
    }
public static void main (String[] args) {
    System.out.println("Введите число");
    Scanner number = new Scanner(System.in);
    int n = number.nextInt();
    //factorial(n);
    int result = factorial(n);
    //System.out.println(factorial (n));
    System.out.println(result);
   }
}