import java.util.Scanner;

public class FindLetterO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фразу");
        String str = sc.nextLine();
        ;

        String[] arr = str.split("");
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase("о"))
                count++;
        }


        System.out.println(count);
    }
}
