package theory;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *  Формирование Максимального Числа из Строки
 *
 *  Задачи:
 * Программа Преобразования Строки в Максимальное Число:
 * Напишите программу, которая принимает число в виде строки.
 * Программа должна выводить максимально возможное число, которое можно составить из цифр входной строки.
 * Если входная строка уже представляет собой максимальное число, программа должна вывести -1.
 * Примеры Ввода и Вывода:
 * Ввод: "123" -> Вывод: 321
 * Ввод: "921" -> Вывод: -1
 * Ввод: "912" -> Вывод: 921
 *
 * Детали Реализации:
 * 1. Конвертация Строки в Массив:
 *   - Преобразуйте входную строку в массив цифр.
 * 2. Обработка и Сортировка:
 *   - Отсортируйте массив цифр в убывающем порядке.
 * 3. Формирование Результата:
 *   - Сформируйте число из отсортированных цифр и сравните его с исходной строкой.
 *   - Если число совпадает с исходной строкой, верните -1.
 *   - В противном случае, верните сформированное число.
 * 4. Вывод Результата:
 *   - Программа должна выводить результат в консоль.
 */


public class PracticeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше число");
        String input = scanner.nextLine();

        while (input.matches("\\d+")) {
            System.out.println("Ваша строка содержит символы помимо чисел, попробуйте еще раз");
            input = scanner.nextLine();
        }

        // получаем массив из строк, каждая строка содержит лишь один символ "123" -> ["1", "2", "3"]
        String[] digits = input.split("");

        // хранит числа, которые соответсвуют числам в digits
        int[] nums = new int[0]; // какой длинны должен быть массив?

        for (int i = 0; i < nums.length; i++) {
            // реализуйте логику, которая будет брать элемент из digits, конвертировать в int и перекладывать в nums.
            // Используйте для этого Integer.parseInt()
        }

        // сортировака nums
        // формирования максимального числа (можно сделать путем добавления в StringBuilder и потом перевода в число)

    }
}