package interCertification1;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 3, 2, 0, 4, 9, 6};

        // Нахождение второго по величине элемента
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Вывод результата
        System.out.println("Второй по величине элемент в массиве: " + secondLargest);
    }
}
