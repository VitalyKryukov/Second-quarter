package org.example.seminar3.hw3;


import org.example.seminar3.hw3.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static boolean isPrimeNumber(int number) {
        for(int i = 2; i < number / 2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Властелин колец", "Толкин", 1954, 752));
        books.add(new Book("Мастера меча онлайн", "Кавахара", 2012, 443));
        books.add(new Book("Автостопом по Галактике", "Адамс", 1979, 640));
        books.add(new Book("О дивный новый мир", "Хаксли", 1932, 353));
        books.add(new Book("Медвежий угол", "Бакман", 2016, 487));

        String searchName = "а";

        for(Book book : books){
            if(book.getAuthor().toLowerCase().contains(searchName)
                    && book.getYear() >= 2010
                    && isPrimeNumber(book.getPageCount())) {
                System.out.println(book.getName());
            }
        }
    }
}
