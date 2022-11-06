public class XXX {

    static void xxx(int codeInput) {
        int[] arrCode = new int[]{2, 4, 9, 6, 8};
        int[] arrPrice = new int[]{30, 20, 40, 31, 99};
        boolean isCodeFlag = false;
        for (int i = 0; i < arrCode.length; i++) {
            if (arrCode[i] == codeInput) {
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
