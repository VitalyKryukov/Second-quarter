package Seminar2;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_2_1 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Укажите целое число или число с плавающей точкой:");

            try {
                double value = sc.nextDouble();
                System.out.println("Вы ввели корректное значение: "+value);
                break;
            } catch (InputMismatchException e) {
                System.err.println("Вы указали не целое число и не число с плавающей точкой.");
                String input = sc.nextLine();
                if (input.indexOf(".") != -1)
                    System.out.println("В качестве разделителя десятичных знаков используйте запятую.");
                System.out.println("Попробуйте ещё раз.\n");
            }

        }
    }
}
