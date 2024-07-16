package interCertification1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;
        int computerScore = 0;

        for (int round = 1; round <= 5; round++) {
            // Ввод пользователя
            System.out.print("Введите К (камень), Н (ножницы) или Б (бумага): ");
            String userChoice = scanner.next().toUpperCase();

            // Выбор компьютера
            String[] options = {"К", "Н", "Б"};
            int randomIndex = random.nextInt(options.length);
            String computerChoice = options[randomIndex];

            // Определение победителя раунда
            if (userChoice.equals("К") && computerChoice.equals("Н") ||
                    userChoice.equals("Н") && computerChoice.equals("Б") ||
                    userChoice.equals("Б") && computerChoice.equals("К")) {
                userScore += 1;
            } else if (computerChoice.equals("К") && userChoice.equals("Н") ||
                    computerChoice.equals("Н") && userChoice.equals("Б") ||
                    computerChoice.equals("Б") && userChoice.equals("К")) {
                computerScore += 1;
            }
        }

        // Определение победителя игры
        if (userScore > computerScore) {
            System.out.println("Вы выиграли! Счет: " + userScore + " : " + computerScore);
        } else if (computerScore > userScore) {
            System.out.println("Компьютер выиграл! Счет: " + computerScore + " : " + userScore);
        } else {
            System.out.println("Ничья! Счет: " + userScore + " : " + computerScore);
        }

        scanner.close();
    }
}
