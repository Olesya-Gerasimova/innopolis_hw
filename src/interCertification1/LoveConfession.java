package interCertification1;

import java.util.Scanner;

public class LoveConfession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод длины забора
        System.out.print("Введите длину забора в сантиметрах: ");
        int fenceLength = scanner.nextInt();

        // Расчет длины надписи
        int loveMessageLength = 15 * 62 + 3 * 12; // 15 букв по 62 см + 3 пробела по 12 см

        // Проверка, поместится ли надпись на заборе
        if (fenceLength >= loveMessageLength) {
            System.out.println("На заборе поместится надпись мальчика.");
        } else {
            System.out.println("На заборе не поместится надпись мальчика.");
        }

        scanner.close();
    }
}
