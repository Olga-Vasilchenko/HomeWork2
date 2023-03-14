public class Task1_2 {
    // 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
    // 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

    public static boolean areRotations(String tmpS, String tmpS1) {
        return (tmpS.length() == tmpS1.length()) &&
                ((tmpS + tmpS).indexOf(tmpS1) != -1);
    }

    public static void main(String[] args) {
        String tmpS = "Привет, как дела?";
        String tmpS1 = "Хорошо!";

        System.out.println(tmpS.equals(tmpS1));

        if (areRotations(tmpS, tmpS1))
            System.out.println("Строки являются вращением друг друга ");
        else
            System.out.printf("Строки не являются вращением друг друга ");
    }
}
