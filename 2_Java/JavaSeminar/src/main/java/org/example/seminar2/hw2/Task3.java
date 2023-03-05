package org.example.seminar2.hw2;

import java.util.Scanner;

public class Task3 {
    public static int[] getIntArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество чисел: ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        System.out.println("Числа:");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = getIntArray();

        int twoDigitNumberSum = 0;
        // Ищем все двузначные числа.
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 9 && array[i] < 100){
                twoDigitNumberSum += i;
            }
        }

        // Заменяем на неё все отрицательные.
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                array[i] = twoDigitNumberSum;
            }
        }

        System.out.print("Результат: ");
        printArray(array);
    }
}
