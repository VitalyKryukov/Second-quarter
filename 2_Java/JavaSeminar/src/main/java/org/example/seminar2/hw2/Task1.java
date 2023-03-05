package org.example.seminar2.hw2;

import java.util.Scanner;

public class Task1 {
    // Проверка числа на то, простое ли оно.
    public static boolean isPrimeNumber(int number) {
        // Нужно попробовать поделить его на все числа до этого самого числа.
        // (Но на самом деле же на все не обязательно, а достаточно и половины)
        for(int i = 2; i < number / 2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number count: ");
        int count = scanner.nextInt();
        System.out.println("Numbers:");
        int summ = 0;
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            if (isPrimeNumber(num)) {
                summ += num;

            }
        }
        scanner.close();
        System.out.print("Prime number count: " + summ);
    }
}
