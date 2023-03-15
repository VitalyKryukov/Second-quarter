package org.example.seminar3.hw2;


import org.example.seminar3.hw2.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Товар 1", "Минас Тирит", 100.0, 11.50, 1));
        products.add(new Product("Товар 2", "Гундабад", 100.0, 99.99, 1));
        products.add(new Product("Товар 3", "Мордор", 100.0, 55.0, 2));
        products.add(new Product("Товар 4", "Шир", 100.0, 18.99, 1));
        products.add(new Product("Товар 5", "Изенгард", 100.0, 1.0, 2));
        products.add(new Product("Товар 6", "Эребор", 100.0, 78.0, 2));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Сорт товара: ");
        int grade = scanner.nextInt();
        System.out.print("Максимальная цена товаров: ");
        double maxPrice = scanner.nextDouble();

        for (Product product : products) {
            if(product.getGrade() == grade && product.getPrice() <= maxPrice){
                System.out.println(product.getName());
            }
        }
    }
}
