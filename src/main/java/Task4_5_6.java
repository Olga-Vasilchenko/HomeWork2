public class Task4_5_6 {
    // 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
    // Используем метод StringBuilder.append().
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder builder = new StringBuilder();

        builder.append(a + " + " + b + " = " + (a + b) + "\n");
        builder.append(a + " - " + b + " = " + (a - b) + "\n");
        builder.append(a + " * " + b + " = " + (a * b));

        System.out.println(builder + "\n");

        // 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

        System.out.println(builder.deleteCharAt(32).insert(32, "равно") + "\n");

    // 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        System.out.println(builder.toString().replaceAll("=", "равно"));
    }
}
