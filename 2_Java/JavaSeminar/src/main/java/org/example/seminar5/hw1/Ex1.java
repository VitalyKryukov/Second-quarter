package org.example.seminar5.hw1;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        String textForSearch = "Россия идет вперед всей планеты. Планета — это не Россия.";
        textForSearch = textForSearch.toLowerCase();    // Преобразуем к нижнему регистру.
        // Удаляем все знаки препинанрия.
        textForSearch = textForSearch.replace(".", "");
        textForSearch = textForSearch.replace(",", "");
        textForSearch = textForSearch.replace(";", "");
        textForSearch = textForSearch.replace(":", "");
        textForSearch = textForSearch.replace("?", "");
        textForSearch = textForSearch.replace("!", "");
        textForSearch = textForSearch.replace("—", "");

        // Делим строку по пробелам.
        String[] wordArray = textForSearch.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : wordArray) {
            if(word.isEmpty()){
                continue;
            }
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (String key : wordCount.keySet()) {
            System.out.println(key + " " + wordCount.get(key));
        }
    }
}
