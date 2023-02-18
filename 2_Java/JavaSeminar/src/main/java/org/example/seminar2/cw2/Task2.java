// 2) Дана последовательность из N целых чисел.
// Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
package org.example.cw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num2 % 2 == 0 && num2 % 10 == 5) {
                sum += num2;
            }
            num = num2;
        }
        scanner.close();
        System.out.println(sum);
    }
}
