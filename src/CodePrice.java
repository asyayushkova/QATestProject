import java.util.Scanner;

public class CodePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrCode = new int[]{2, 4, 9, 6, 8};
        int[] arrPrice = new int[]{30, 20, 40, 31, 99};
        int code = sc.nextInt();
        boolean isCodeFlag = false;
        for (int i = 0; i < arrCode.length; i++) {
            if (arrCode[i] == code) {
                System.out.println("Будет стоить = " + arrPrice[i]);
                isCodeFlag = true;
                break;
            }
        }
        if (!isCodeFlag) {
            System.out.println("Нет такого товара");
        }
    }
}
