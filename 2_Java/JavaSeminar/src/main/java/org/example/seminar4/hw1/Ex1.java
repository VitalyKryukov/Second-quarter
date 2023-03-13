package org.example.seminar4.hw1;

import java.util.*;

public class Ex1 {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Введите последовательность:");

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 7; i++) {
            linkedList.add(scanner.nextInt());
        }

        System.out.println("Последовательность в перевёрнутом виде:");
        while (linkedList.size() > 0){
            System.out.print(linkedList.removeLast() + " ");
        }
    }
}
