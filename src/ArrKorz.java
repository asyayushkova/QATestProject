import java.util.Arrays;

public class ArrKorz {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c", "d", "e"};
        String korz = arr[0];
        for (int i = 1; i < arr.length; i++) {
            korz += arr[i];
        }
        System.out.println(korz);


        String[] arr2 = korz.split("");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        for (String str : arr2) {
            System.out.println(str);

        }
    }
}
