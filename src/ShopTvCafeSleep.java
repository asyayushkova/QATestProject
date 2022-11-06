import java.util.Scanner;

public class ShopTvCafeSleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время: ");
        int t = sc.nextInt();
        System.out.println("Введите количество денег: ");
        double n = sc.nextInt();
        if (t > 8 & t < 12 & n > 10) {
            System.out.println("Идите в магазин");
        } else if (t > 12 & n > 50) {
            System.out.println("Идите в кафе");
        } else if ((t > 19) & t < 22) {
            System.out.println("Посмотрите телевизор");
        } else if (t > 22) {
            System.out.println("Идите спать");
        } else {
            System.out.println("Мы не придумали Вам занятие");
        }
    }
}
