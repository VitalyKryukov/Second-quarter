package org.example.seminar5.hw2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите предложение: ");
        String text = scanner.nextLine();
        System.out.print("Введите искомое слово: ");
        String searchWord = scanner.nextLine();

        text = text.toLowerCase();    // Преобразуем к нижнему регистру.
        // Удаляем все знаки препинанрия.
        text = text.replace(".", "");
        text = text.replace(",", "");
        text = text.replace(";", "");
        text = text.replace(":", "");
        text = text.replace("?", "");
        text = text.replace("!", "");
        text = text.replace("—", "");

        // Делим строку по пробелам.
        String[] wordArray = text.split(" ");

        int searchWordCount = 0;
        for (String word : wordArray) {
            if(word.equals(searchWord)){
                searchWordCount++;
            }
        }

        System.out.println("Количество повторений искомого слова: " + searchWordCount);
    }
}
