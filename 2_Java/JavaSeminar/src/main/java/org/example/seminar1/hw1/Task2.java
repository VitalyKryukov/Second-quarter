package org.example.seminar1.hw1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.printf("Сумма + чисел, стоящих перед - числами = %s", sumPosNum());
    }

    /**
     * Дана последовательность целых чисел, оканчивающаяся нулем.
     * Найти сумму положительных чисел, после которых следует отрицательное число.
     * @return сумму положительных чисел
     */
    public static int sumPosNum() {
        Scanner iScanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите числа или 0 для начала подсчета: ");
        int num = iScanner.nextInt();
        while (num != 0) {
            int numN = iScanner.nextInt();
            if (num > 0 && numN < 0) {
                sum += num;
            }
            num = numN;
        }
        iScanner.close();
        return sum;
    }
}
