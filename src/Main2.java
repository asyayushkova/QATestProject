import java.util.Scanner;

public class Main2 {
    static int power (int n, int a) {
        int result = 1;
        for (int i = 0; i<a; i++) {
            result = result * n;
        }
        return result;
    }
    public static void main (String [] args){
        System.out.println("Введите число");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        int result = power(n,n);
        System.out.println(result);
    }
}
