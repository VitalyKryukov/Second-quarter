package org.example.seminar2.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество чисел: ");
        int count = scanner.nextInt();
        System.out.println("Числа:");

        // Изначально предположим, что последовательность возрастающая.
        boolean increases = true;
        // И чтобы условие внутри цикла работало, запомним пока самое минимальное число, которое только может быть.
        int lastNumber = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            int currentNumber = scanner.nextInt();
            if(currentNumber < lastNumber){
                increases = false;
            }
            lastNumber = currentNumber;
        }
        scanner.close();

        if(increases){
            System.out.print("Последовательность является возрастающей");
        } else {
            System.out.print("Последовательность НЕ является возрастающей");
        }
    }
}
