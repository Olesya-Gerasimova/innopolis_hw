package interCertification1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

public class CactusWatering {
    public static void main(String[] args) {
        // Дата последнего полива
        LocalDate lastWateringDate = LocalDate.of(2024, Month.JUNE, 15); // Пример

        // Текущая дата
        LocalDate currentDate = LocalDate.now();

        // Расчет периода полива в зависимости от сезона и влажности
        int wateringInterval;
        if (currentDate.getMonth().getValue() >= 12 || currentDate.getMonth().getValue() <= 2) {
            // Зима: раз в месяц
            wateringInterval = 30;
        } else if (currentDate.getMonth().getValue() >= 3 && currentDate.getMonth().getValue() <= 5 ||
                currentDate.getMonth().getValue() >= 9 && currentDate.getMonth().getValue() <= 11) {
            // Весна и осень: раз в неделю
            wateringInterval = 7;
        } else {
            // Лето: раз в два дня, если влажность меньше 30%
            Random random = new Random();
            int humidity = random.nextInt(100); // Влажность воздуха (пример случайного числа)

            if (humidity < 30) {
                wateringInterval = 2;
            } else {
                wateringInterval = 0; // Не поливаем, если влажность больше или равна 30%
            }
        }

        // Расчет следующей даты полива
        LocalDate nextWateringDate = lastWateringDate.plusDays(wateringInterval);

        // Вывод результата
        System.out.println("Дата следующего полива кактуса: " + nextWateringDate);
    }
}

