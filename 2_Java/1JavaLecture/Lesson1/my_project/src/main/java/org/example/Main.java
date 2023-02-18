package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int s = 123;
        s = --s - s--;
        System.out.println(s);
        System.out.println(getType(s)); // getType - покажет класс, но нужен метод, который описывается ниже.
        sayHi();
    }

    static void sayHi(){
        System.out.println("hi");
    }
    static String getType(Object o){ // метод для определения класса
        return o.getClass().getSimpleName();
    }
}