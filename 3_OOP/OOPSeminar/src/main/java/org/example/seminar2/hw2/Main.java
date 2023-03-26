package org.example.seminar2.hw2;

public class Main {
    public static void main(String[] args) {
        Human hm = new Human();
        hm.name = "Кто-то";
        Market mk = new Market();
        mk.update(hm);
    }
}