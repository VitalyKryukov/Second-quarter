package org.example.seminar1.cw1.task2;

public abstract class Product {
    protected static String name;
    protected static int price;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Product.name = name;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Product.price = price;
    }
}
